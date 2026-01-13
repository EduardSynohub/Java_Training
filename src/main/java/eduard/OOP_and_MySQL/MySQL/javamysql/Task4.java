package eduard.OOP_and_MySQL.MySQL.javamysql;

import java.sql.Connection;
import java.sql.SQLException;

public class Task4 {
    public static final String ALL_FILMS_QUERY = "SELECT title FROM movies";

    public static void main(String[] args) {
        try (Connection conn = DbUtil.connect(Task3.CINEMAS_DB)) {
            System.out.println("Make a connection to database: " + Task3.CINEMAS_DB);
            DbUtil.printData(conn, ALL_FILMS_QUERY, "title");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
