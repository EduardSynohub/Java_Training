package eduard.OOP_and_MySQL.MySQL.javamysql;

import java.sql.Connection;
import java.sql.SQLException;

public class Task1 {
    public static void main(String[] args) {
        try (Connection conn = DbUtil.connect()) {
            System.out.println("Make a connection to database: products_ex");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try (Connection conn = DbUtil.connect("cinemas_ex")) {
            System.out.println("Make a connection to database: cinemas_ex");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
