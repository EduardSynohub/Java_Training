package eduard.javaBasics.datainput;


import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        try {
            equation();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }


    public static double readDouble(Scanner scanner, String message) {
        System.out.println(message);
        while (!scanner.hasNextDouble()) {
            scanner.nextLine();
            System.out.println(message);
        }
        return scanner.nextDouble();
    }

    public static void equation() {
        Scanner scanner = new Scanner(System.in);

        double a = readDouble(scanner, "Write first number:");
        if (a == 0) {
            throw new IllegalArgumentException("First number can`t be a 0!!!");
        }
        double b = readDouble(scanner, "Write second number:");
        double c = readDouble(scanner, "Write third number:");

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double x1 = (- b + Math.sqrt(delta)) / (2 * a);
            double x2 = (- b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("The equation has two solutions: %.2f and %.2f%n", x1, x2);
        } else if (delta == 0) {
            double x = (-b) / (2 * a);
            System.out.println("The equation has one solution: " + x);
        } else {
            System.out.println("The equation has no solutions.");
        }
    }


}
