package eduard.javaBasics.datainput;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        operations();
    }

    public static void operations() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write first number:");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Write correct number!");
        }
        int firstNumber = scanner.nextInt();

        System.out.println("Write second number:");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Write correct number!");
        }
        int secondNumer = scanner.nextInt();
        System.out.println(firstNumber + " + " + secondNumer + " = " + (firstNumber + secondNumer));
        System.out.println(firstNumber + " - " + secondNumer + " = " + (firstNumber - secondNumer));
        System.out.println(firstNumber + " * " + secondNumer + " = " + (firstNumber * secondNumer));
        try {
            System.out.println(firstNumber + " / " + secondNumer + " = " + ((double)firstNumber / (double)secondNumer));
        } catch (ArithmeticException e) {
            System.out.println("You can`t " + e.getMessage());
        }
    }
}
