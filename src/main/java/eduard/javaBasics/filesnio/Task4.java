package eduard.javaBasics.filesnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        writeToFile("testing_task4.txt");
    }

    public static void writeToFile(String fileName) {
        Path filePath = Paths.get(fileName);

        if (Files.exists(filePath)) {
            System.out.println("File with name '" + fileName + "' already exist.");
        } else {
            try {
                Files.createFile(filePath);
            } catch (IOException e) {
                System.out.println("Something went wrong: " + e.getMessage());
            }
        }

        List<String> lines = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter some text (type 'quit' to finish):");
            String s = scanner.nextLine();
            if (s.equalsIgnoreCase("quit")) {
                break;
            }
            lines.add(s);
        }
        try {
            Files.write(filePath, lines);
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.out.println("Cannot save data to the file: " + e.getMessage());
        }
    }
}
