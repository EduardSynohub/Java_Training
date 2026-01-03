package eduard.javaBasics.filesnio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        readFromFile("testing.html");
    }

    public static void readFromFile(String fileName) {
        File file = new File(fileName);
        Path path = Paths.get(fileName);
        if (Files.exists(path)) {
            System.out.println("File with name '" + fileName + "' already exist.");
            try {
                Scanner scanner = new Scanner(file);
                System.out.println("Data from the file '" + fileName + "': \n");
                while (scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine());
                }
            } catch (FileNotFoundException e) {
                System.out.println("File '" + fileName + "' does not exist.");
            }
        } else {
            try {
                Files.createFile(path);
                System.out.println("Creating file with name " + fileName);
                PrintWriter printWriter = new PrintWriter(fileName);
                System.out.println("Saving data to the file '" + fileName + "'");
                printWriter.println("""
                    <html>
                    <body>
                    <p>pierwsza linia</p>
                    <p>druga linia</p>
                    </body>
                    </html>""");
                printWriter.close();
            } catch (IOException e) {
                System.out.println("Something went wrong: " + e.getMessage());
                System.out.println("File '" + fileName + "' don`t exist.");
            }
        }
    }
}
