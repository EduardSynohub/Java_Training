package eduard.javaBasics.datainput;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        printTriangle();
    }

    public static void printTriangle() {
        System.out.println("Enter the length of the side of the triangle: ");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Enter the length of the side of the triangle: ");
        }
        int triangleSide = scanner.nextInt();
        if (triangleSide <= 0) {
            System.out.println("You must enter a positive number.");
        }
        for (int i = 0; i <= triangleSide; i++) {
            System.out.println(" ");
            for (int j = 0; j < i; j++) {
                System.out.print("X");
            }
        }
    }
}
