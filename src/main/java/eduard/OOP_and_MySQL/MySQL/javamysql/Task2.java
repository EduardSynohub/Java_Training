package eduard.OOP_and_MySQL.MySQL.javamysql;

import java.sql.Connection;
import java.sql.SQLException;

public class Task2 {
    public static final String INSERT_PRODUCT_QUERY = "INSERT INTO products (name, description, price) VALUES (?, ?, ?)";

    public static void main(String[] args) {
        try (Connection conn = DbUtil.connect()) {
            DbUtil.insert(conn, INSERT_PRODUCT_QUERY, "Headphones", "Regular headphones", "35.99");
            DbUtil.insert(conn, INSERT_PRODUCT_QUERY, "USB cable", "Regular USB cable", "5.99");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
