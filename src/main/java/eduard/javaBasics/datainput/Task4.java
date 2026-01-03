package eduard.javaBasics.datainput;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        try {
            rowsColumns();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void rowsColumns() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Write how much rows you want: ");
        while (!scanner1.hasNextInt()) {
            System.out.println("Write how much rows you want: ");
            scanner1.nextLine();
        }

        int rows = scanner1.nextInt();
        if (rows <= 0) {
            throw new IllegalArgumentException("You entered a negative number or zero for the number of rows!");
        }

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Write how much columns you want: ");
        while (!scanner2.hasNextInt()) {
            System.out.println("Write how much columns you want: ");
            scanner2.nextLine();
        }
        int columns = scanner2.nextInt();
        if (columns <= 0) {
            throw new IllegalArgumentException("You entered a negative number or zero for the number of columns!");
        }

        Random r = new Random();
        double sum = 0.0;
        double count = rows * columns;

        for (int i = 0; i < rows; i++) {
            System.out.print(" \n");
            for (int j = 0; j < columns; j++) {
                int randomNumber = r.nextInt(1, 1001);
                System.out.print(randomNumber + " ");
                sum += randomNumber;
            }
        }
        System.out.println();
        System.out.println("\nThe sum of all numbers in the table is " + sum);
        System.out.println("The average of all numbers in the table is " + sum/count);
    }
}
