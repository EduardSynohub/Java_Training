package eduard.javaBasics.filesnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task1 {
    public static void main(String[] args) {
        createDirectory("testDir");
    }

    public static void createDirectory(String directoryName) {
        Path directoryPath = Paths.get(directoryName);
        if (Files.exists(directoryPath)) {
            System.out.println("Directory with name '" + directoryName + "' already exist.");
        } else {
            try {
                Files.createDirectory(directoryPath);
            } catch (IOException e) {
                System.out.println("Something went wrong " + e.getMessage());
            }
        }
    }
}
