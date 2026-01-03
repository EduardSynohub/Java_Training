package eduard.javaBasics.filesnio;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        rewrite();
    }

    public static void rewrite() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of the file to find:");
        String fileName = scanner.nextLine();
        String file = fileName + "_2.txt";
        Path findingFile = Paths.get(fileName + ".txt");
        Path secondFile = Paths.get(file);
        if (Files.exists(findingFile)) {
            try {
                Files.copy(findingFile, secondFile, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                System.out.println("Something went wrong: " + e.getMessage());
            }
            try (FileWriter fileWriter = new FileWriter(file, true)) {
                    for (String s : Files.readAllLines(findingFile)) {
                        fileWriter.append(s).append("\n");
                    }
            } catch (IOException e) {
                System.out.println("Something went wrong with writing: " + e.getMessage());
            }
        }
    }
}
