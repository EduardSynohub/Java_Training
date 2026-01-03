package eduard.javaBasics.datainput;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?:");
        String firstName = scanner.nextLine();
        System.out.println("How old are you?:");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Give correct number");
        }
        int age = scanner.nextInt();

        System.out.println(firstName + " is " + age + " years old.");
    }
}
