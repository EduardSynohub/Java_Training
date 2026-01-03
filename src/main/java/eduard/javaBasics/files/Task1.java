package eduard.javaBasics.files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        try (PrintWriter printWriter = new PrintWriter("text1.txt")) {
            while (!input.equalsIgnoreCase("quit")) {
                System.out.println("Enter some text: ");
                input = scanner.nextLine();
                if (!input.equalsIgnoreCase("quit")) {
                    printWriter.println(input);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
