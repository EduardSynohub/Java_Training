package eduard.javaBasics.filesnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task2 {
    public static void main(String[] args) {
        createFile("testFile");
    }

    public static void createFile (String fileName) {
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
    }
}
