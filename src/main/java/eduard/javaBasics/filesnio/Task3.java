package eduard.javaBasics.filesnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task3 {
    public static void main(String[] args) {
        copyFile("testDir", "test_file_for_task3.txt", "task3_copy.txt");
    }

    public static void copyFile(String directory, String fileName, String secondFileName) {
        Path file1path = Paths.get(directory, fileName);
        Path file2path = Paths.get(directory, secondFileName);
        if (Files.exists(file2path)) {
            System.out.println("File with name '" + secondFileName + "' already exist.");
        } else {
            try {
                Files.copy(file1path, file2path);
            } catch (IOException e) {
                System.out.println("Something went wrong: " + e.getMessage());
            }
        }
    }
}
