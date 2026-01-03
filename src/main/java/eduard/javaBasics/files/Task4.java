package eduard.javaBasics.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        fileCreator("""
                Java is a popular programming language used all over the world.
                Many developers choose Java because it is reliable and platform-independent.
                Java is often used to create desktop applications, web services, and Android apps.
                Thanks to its strong community and long history, Java remains one of the most important technologies in software development.""", "Text_for_task_4");
        File file = new File("Text_for_task_4.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] strings = scanner.nextLine().split(" ");
                for (String s : strings) {
                    if (s.equalsIgnoreCase("Java")) {
                        System.out.println(s);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found while reading.");
        }
    }

    public static void fileCreator(String someText, String nameOfFile) {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(nameOfFile + ".txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        printWriter.println(someText);
        printWriter.close();
    }
}
