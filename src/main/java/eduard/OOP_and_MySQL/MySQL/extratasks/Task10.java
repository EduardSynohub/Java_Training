package eduard.OOP_and_MySQL.MySQL.extratasks;

import eduard.OOP_and_MySQL.MySQL.javamysql.DbUtil;
import eduard.OOP_and_MySQL.MySQL.javamysql.Task3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task10 {
    public static final String ALL_CINEMAS_QUERY = "SELECT c.id, c.name FROM cinemas c";
    public static final String CHECK_CINEMA_ID_QUERY = "SELECT 1 FROM cinemas WHERE id = ?";
    public static final String ALL_MOVIES_IN_CINEMA_QUERY = "SELECT m.title, m.id FROM cinemas c\n" +
            "JOIN cinemas_movies cm on c.id = cm.cinema_id\n" +
            "JOIN movies m on m.id = cm.movie_id\n" +
            "WHERE c.id = ?";
    public static List<Integer> MOVIES_ID_LIST = new ArrayList<>();
    public static final String ALL_SCREENINGS_FOR_MOVIE_QUERY = "SELECT s.show_time FROM screenings s\n" +
            "         JOIN cinemas c on c.id = s.cinema_id\n" +
            "WHERE s.movie_id = ? AND c.id = ?";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (Connection connection = DbUtil.connect(Task3.CINEMAS_DB)) {
            showAllCinemas(connection);

            int cinemaId = readId(scanner, "\nPlease enter cinema ID: ");

            if (!checkCinemaId(connection, cinemaId)) {
                System.out.println("Cinema with ID " + cinemaId + " doesn't exist!");
            } else {
                showAllMoviesInCinema(connection, cinemaId);
            }

            int movieId = readId(scanner, "\nPlease enter movie ID: ");

            for (int i : MOVIES_ID_LIST) {
                if (movieId == i) {
                    showAllScreeningForMovie(connection, movieId, cinemaId);
                }
            }

        } catch (SQLException e) {
            System.out.println("First ops... " + e.getMessage());
        }
    }
    public static void showAllCinemas(Connection conn) throws SQLException {
        try (PreparedStatement ps = conn.prepareStatement(ALL_CINEMAS_QUERY)) {
            ResultSet rs = ps.executeQuery();
            System.out.println("------Cinemas list------");
            while (rs.next()) {
                System.out.println("Id: " + rs.getInt(1) + " Cinema: " + rs.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean checkCinemaId(Connection connection, int id) {
        try (PreparedStatement ps = connection.prepareStatement(CHECK_CINEMA_ID_QUERY)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            return false;
        }
    }

    public static void showAllMoviesInCinema(Connection connection, int cinemaId) {
        MOVIES_ID_LIST.clear();

        try (PreparedStatement ps = connection.prepareStatement(ALL_MOVIES_IN_CINEMA_QUERY)) {
            ps.setInt(1, cinemaId);
            ResultSet rs = ps.executeQuery();

            boolean showMovie = false;

            while (rs.next()) {
                if (!showMovie) {
                    System.out.println("All movies in that cinema:");
                    showMovie = true;
                }
                System.out.println("Movie: " + rs.getString(1) + " with ID " + rs.getInt(2));
                MOVIES_ID_LIST.add(rs.getInt(2));
            }
                if (!showMovie) {
                    System.out.println("In that cinema we don`t have any movies!");
                }
        } catch (SQLException e) {
            System.out.println("Second ops... " + e.getMessage());
        }
    }
    private static int readId(Scanner scanner, String message) {
        while (true) {
            System.out.println(message);
            String input = scanner.nextLine();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
            }
        }
    }
    private static void showAllScreeningForMovie(Connection connection, int movieId, int cinemaId) {
        try (PreparedStatement ps = connection.prepareStatement(ALL_SCREENINGS_FOR_MOVIE_QUERY)) {
            ps.setInt(1, movieId);
            ps.setInt(2, cinemaId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(" Show time: " + rs.getString(1));
            }
        } catch (SQLException e) {
            System.out.println("Third ops... " + e.getMessage());
        }
    }
}
