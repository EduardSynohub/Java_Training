package eduard.javaBasics.files;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        createFileWithNumbers();
        File file = new File("Task3_files.txt");
        double sum = 0.0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                    for (String s : scanner.nextLine().split(", ")) {
                        try {
                            double d = Double.parseDouble(s);
                            sum += d;
                        } catch (NumberFormatException e) {
                            System.out.println(s + " - is not a number.");
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.printf("%.2f", sum);
    }

    public static void createFileWithNumbers() {
        try {
            PrintWriter printWriter = new PrintWriter("Task3_files.txt");
            printWriter.println("1.1, 1.2, 1.3, 2.0, 1.8");
            printWriter.println("1.3, aa, 4.5, 6.7, 2.1 ");
            printWriter.println("3.5, 7.7, 9.9, 4.1, 2.1");
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
