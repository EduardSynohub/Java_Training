package eduard.OOP_and_MySQL.MySQL.extratasks;

import eduard.OOP_and_MySQL.MySQL.javamysql.DbUtil;
import eduard.OOP_and_MySQL.MySQL.javamysql.Task3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Task9 {
    public static final String ALL_MOVIES_IN_CINEMA_QUERY = "SELECT c.id, c.name, m.id, m.title FROM cinemas c\n" +
            "    JOIN cinemas_movies cm on c.id = cm.cinema_id\n" +
            "    JOIN movies m on m.id = cm.movie_id\n" +
            "    WHERE c.name LIKE CONCAT('%', ?, '%')";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cinemaName = scanner.nextLine();

        try (Connection conn = DbUtil.connect(Task3.CINEMAS_DB)) {
            showAllMoviesInCinema(conn, cinemaName);
        } catch (SQLException e) {
            System.out.println("Ups... " + e.getMessage());
        }
    }

    public static void showAllMoviesInCinema(Connection connection, String cinemaName) throws SQLException {
        try (PreparedStatement ps = connection.prepareStatement(ALL_MOVIES_IN_CINEMA_QUERY)) {
            ps.setString(1, cinemaName);

            ResultSet rs = ps.executeQuery();

            boolean hasMovie = false;

            while (rs.next()) {
                if (!hasMovie) {
                    System.out.println("Cinema '" + rs.getString(2) + "' with id " + rs.getInt(1) + ":");
                    hasMovie = true;
                }
                System.out.println("     Movie '" + rs.getString(4) + "' with id " + rs.getInt(3));
            }
                if (!hasMovie){
                    System.out.println("We don`t have cinema with name: " + cinemaName);
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
