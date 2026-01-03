package eduard.javaBasics.datainput;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        textLines();
    }

    public static void textLines() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Write some text: ");
            String someText = scanner.nextLine();

            if (someText.equals("quit")) {
                break;
            }

            System.out.println(someText);
        }
    }
}
