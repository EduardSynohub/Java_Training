package eduard.OOP_and_MySQL.MySQL.javamysql;

import java.sql.Connection;
import java.sql.SQLException;

public class Task6 {
    public static final String SELECT_RATING_FILMS_QUERY = "SELECT title FROM movies\n" +
            "    WHERE rating > (SELECT AVG(rating) FROM movies)";

    public static void main(String[] args) {
        try (Connection conn = DbUtil.connect(Task3.CINEMAS_DB)) {
            DbUtil.printData(conn, SELECT_RATING_FILMS_QUERY, "title");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
