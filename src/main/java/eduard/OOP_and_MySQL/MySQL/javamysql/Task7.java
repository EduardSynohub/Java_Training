package eduard.OOP_and_MySQL.MySQL.javamysql;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task7 {
    public static final String SELECT_ALL_CINEMAS_QUERY = "SELECT * FROM cinemas";
    public static final String UPDATE_CINEMA_QUERY = "UPDATE cinemas SET name = ?, address = ?\n" +
            "    WHERE id = ?";
    public static final String DELETE_CINEMA_QUERY = "DELETE FROM cinemas\n" +
            "    WHERE id = ?";
    public static final String CHECK_CINEMA_ID_QUERY = "SELECT id FROM cinemas WHERE id = ?";
    public static List<String> LIST_OF_CINEMAS = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cinemaIdToDelete = -1;
        String cinemaNewName;
        String cinemaNewAddress;
        String answer = "";
        String deleteAnswer = "";

        try (Connection conn = DbUtil.connect(Task3.CINEMAS_DB)) {
            allCinemasAsList(conn, LIST_OF_CINEMAS);

            printList();

            do {
                System.out.println("\nWhat do you want to do: \n E - edit cinema \n D - delete cinema \n X - exit?");

                answer = scanner.nextLine();

                if (answer.equalsIgnoreCase("e")) {

                    int cinemaIdToChange;

                    while (true) {
                        System.out.println("Please enter id to change:");
                        String input = scanner.nextLine();

                        try {
                            cinemaIdToChange = Integer.parseInt(input);
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Please enter a valid number!");
                        }
                    }

                    if (checkCinemaId(conn, cinemaIdToChange)) {
                        scanner.nextLine();
                        System.out.println("Enter new name for cinema with id " + cinemaIdToChange + ": ");
                        cinemaNewName = scanner.nextLine();

                        System.out.println("Enter new address for cinema " + cinemaNewName + ": ");
                        cinemaNewAddress = scanner.nextLine();

                        updateCinemaInfo(conn, cinemaNewName, cinemaNewAddress, cinemaIdToChange);
                        allCinemasAsList(conn, LIST_OF_CINEMAS);
                        printList();
                    } else {
                        System.out.println("Cinema with ID " + cinemaIdToChange + " doesn't exist!");
                    }
                } else if (answer.equalsIgnoreCase("d")) {
                    do {
                        System.out.println("Do you really want to delete cinema? \n Y - for yes \n N - for no");
                        deleteAnswer = scanner.nextLine();

                        if (deleteAnswer.equalsIgnoreCase("y")) {
                            System.out.println("Please enter id to delete: ");
                            while (!scanner.hasNextInt()) {
                                System.out.println("Please enter id to delete:");
                                scanner.nextLine();
                            }

                            cinemaIdToDelete = scanner.nextInt();
                            scanner.nextLine();

                            if (checkCinemaId(conn, cinemaIdToDelete)) {
                                deleteCinema(conn, cinemaIdToDelete);
                                allCinemasAsList(conn, LIST_OF_CINEMAS);
                                printList();
                            } else {
                                System.out.println("Cinema with ID " + cinemaIdToDelete + " doesn't exist!");
                            }
                        } else if (deleteAnswer.equalsIgnoreCase("n")) {
                            System.out.println("You changed your mind.");
                        }
                    } while (!deleteAnswer.equalsIgnoreCase("y") && !deleteAnswer.equalsIgnoreCase("n"));
                }
            } while (!answer.equalsIgnoreCase("x"));
        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
    public static void allCinemasAsList(Connection connection, List<String> cinemasList) throws SQLException {
        cinemasList.clear();
        try (PreparedStatement ps = connection.prepareStatement(SELECT_ALL_CINEMAS_QUERY)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int cinemaId = rs.getInt("id");
                String cinemaName = rs.getString("name");
                String cinemaAddress = rs.getString("address");
                cinemasList.add("ID " + cinemaId + ": Cinema - " + cinemaName + ", Address - " + cinemaAddress);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void deleteCinema(Connection connection, int idToDelete) {
        try (PreparedStatement ps = connection.prepareStatement(DELETE_CINEMA_QUERY)) {
            ps.setInt(1, idToDelete);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void updateCinemaInfo(Connection connection, String cinemaName, String cinemaAddress, int cinemaId) {
        try (PreparedStatement ps = connection.prepareStatement(UPDATE_CINEMA_QUERY)) {
            ps.setString(1, cinemaName);
            ps.setString(2, cinemaAddress);
            ps.setInt(3, cinemaId);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printList() {
        for (String s : LIST_OF_CINEMAS) {
            System.out.println(s);
        }
    }

    public static boolean checkCinemaId(Connection connection, int cinemaIdToCheck) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(CHECK_CINEMA_ID_QUERY)) {
            preparedStatement.setInt(1, cinemaIdToCheck);
            ResultSet rs = preparedStatement.executeQuery();

            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
