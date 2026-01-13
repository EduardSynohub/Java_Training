package eduard.OOP_and_MySQL.MySQL.javamysql;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter film id:");
        while (!scanner.hasNextInt()) {
            System.out.println("Enter film id:");
            scanner.nextLine();
        }
        int idToRemove = scanner.nextInt();

        try (Connection conn = DbUtil.connect(Task3.CINEMAS_DB)) {
            DbUtil.remove(conn, "movies", idToRemove);
        } catch (SQLException e) {
            throw  new RuntimeException(e);
        }
    }
}
