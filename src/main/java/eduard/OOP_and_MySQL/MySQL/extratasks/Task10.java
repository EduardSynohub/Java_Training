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
            }

            List<Integer> movieIds = showAllMoviesInCinema(connection, cinemaId);

            if (movieIds.isEmpty()) {
                return;
            }

            int movieId = readId(scanner, "\nPlease enter movie ID: ");

            if (!movieIds.contains(movieId)) {
                System.out.println("This movie does not belong to selected cinema!");
                return;
            }

            showAllScreeningsForMovie(connection, movieId, cinemaId);
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
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

    public static List<Integer> showAllMoviesInCinema(Connection connection, int cinemaId) {
        List<Integer> movieIdList = new ArrayList<>();

        try (PreparedStatement ps = connection.prepareStatement(ALL_MOVIES_IN_CINEMA_QUERY)) {
            ps.setInt(1, cinemaId);
            ResultSet rs = ps.executeQuery();

            boolean hasMovie = false;

            while (rs.next()) {
                if (!hasMovie) {
                    System.out.println("\nMovies in selected cinema:");
                    hasMovie = true;
                }
                System.out.println("Movie ID: " + rs.getInt(2) + " | Title: " + rs.getString(1));
                movieIdList.add(rs.getInt(2));
            }
                if (!hasMovie) {
                    System.out.println("This cinema has no movies.");
                }
        } catch (SQLException e) {
            System.out.println("Error loading movies: " + e.getMessage());
        }

        return movieIdList;
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
    private static void showAllScreeningsForMovie(Connection connection, int movieId, int cinemaId) {
        try (PreparedStatement ps = connection.prepareStatement(ALL_SCREENINGS_FOR_MOVIE_QUERY)) {
            ps.setInt(1, movieId);
            ps.setInt(2, cinemaId);
            ResultSet rs = ps.executeQuery();

            boolean hasScreenings = false;

            while (rs.next()) {
                if (!hasScreenings) {
                    System.out.println("\nScreenings:");
                    hasScreenings = true;
                }
                System.out.println("Show time: " + rs.getString(1));
            }

            if (!hasScreenings) {
                System.out.println("No screenings for this movie in this cinema.");
            }

        } catch (SQLException e) {
            System.out.println("Error loading screenings: " + e.getMessage());
        }
    }
}
