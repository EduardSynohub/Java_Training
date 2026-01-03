package eduard.javaBasics.datainput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        try {
            getData();
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void getData() {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Write a number: ");

            if (!scanner.hasNextInt()) {
                throw new InputMismatchException("You must write a number!!!");
            }
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }
            sum += number;
        }
        System.out.println(sum);
    }
}
