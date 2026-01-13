package eduard.OOP_and_MySQL.MySQL.javamysql;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Task3 {
    public static final String INSERT_CINEMA_QUERY = "INSERT INTO cinemas (name, address) VALUES (?, ?)";
    public static final String CINEMAS_DB = "cinemas_ex";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter cinema name to add:");
        String cinemaName = scanner.nextLine();

        System.out.println("Enter cinema address:");
        String addressCinema = scanner.nextLine();

        addCinema(cinemaName, addressCinema);
    }
    public static void addCinema(String name, String address) {
        try (Connection conn = DbUtil.connect(CINEMAS_DB)) {
            System.out.println("Make a connection to database: " + CINEMAS_DB);
            DbUtil.insert(conn, INSERT_CINEMA_QUERY, name, address);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
