package eduard.OOP_and_MySQL.MySQL.extratasks;

import eduard.OOP_and_MySQL.MySQL.javamysql.DbUtil;
import eduard.OOP_and_MySQL.MySQL.javamysql.Task3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Task8 {
    public static final String SHOW_MOVIE_QUERY = "SELECT title, description, rating FROM movies\n" +
            "    WHERE title LIKE CONCAT('%', ? , '%')";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter movie title to find: ");
        String titleToFind = scanner.nextLine();

        try (Connection connection = DbUtil.connect(Task3.CINEMAS_DB)) {
            showMovieInformation(connection, titleToFind);
        } catch (SQLException e) {
            System.out.println("Ups..." + e.getMessage());
        }
    }

    public static void showMovieInformation(Connection connection, String movieTitle) throws SQLException{
        try (PreparedStatement preparedStatement = connection.prepareStatement(SHOW_MOVIE_QUERY)) {
            preparedStatement.setString(1, movieTitle);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                System.out.println("Title: " + rs.getString(1));
                System.out.println("Description: " + rs.getString(2));
                System.out.println("Rating: " + rs.getString(3) + "\n");
            } else {
                System.out.println("We don`t have movie: '" + movieTitle + "'.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
