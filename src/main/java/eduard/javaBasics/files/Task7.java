package eduard.javaBasics.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println(count("task3_files.txt"));
    }

    public static int count(String fileName) {
        File file = new File(fileName);
        int counter = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                for (String ignored : s.split(" ")) {
                    counter ++;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File '" + fileName + "' does not exist.");
        }
        return counter;
    }
}
