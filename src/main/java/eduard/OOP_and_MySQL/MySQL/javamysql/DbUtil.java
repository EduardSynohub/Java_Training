package eduard.OOP_and_MySQL.MySQL.javamysql;

import java.sql.*;

public class DbUtil {
    public static final String DB_ADDRESS = "jdbc:mysql://localhost:3306/";
    public static final String DEFAULT_DB = "products_ex";
    public static final String DB_PARAMS = "?useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
    public static final String DB_USER = "root";
    public static final String DB_PASS = "1008";
    private static final String DELETE_QUERY = "DELETE FROM tableName where id = ?";


    public static Connection connect() throws SQLException {
        return connect(DEFAULT_DB);
    }

    public static Connection connect(String dbname) throws SQLException {
        String dbUrl = DB_ADDRESS + dbname + DB_PARAMS;
        return DriverManager.getConnection(dbUrl, DB_USER, DB_PASS);
    }

    public static void insert(Connection conn, String query, String... params) {
        try ( PreparedStatement statement = conn.prepareStatement(query)) {
            for (int i = 0; i < params.length; i++) {
                statement.setString(i + 1, params[i]);
            }
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void printData(Connection conn, String query, String... columnNames) throws SQLException {

        try (PreparedStatement statement = conn.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery();) {
            while (resultSet.next()) {
                for (String columnName : columnNames) {
                    System.out.println(resultSet.getString(columnName));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void remove(Connection conn, String tableName, int id) {
        try (PreparedStatement statement =
                     conn.prepareStatement(DELETE_QUERY.replace("tableName", tableName));) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
