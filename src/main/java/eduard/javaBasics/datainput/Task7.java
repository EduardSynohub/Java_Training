package eduard.javaBasics.datainput;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        nettoBrutto();
    }

    public static void nettoBrutto() {
        Scanner textScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Which operation you want to do: bn or nb? ");
            String str = textScanner.nextLine();
            if (str.equals("bn") || str.equals("nb")) {
                Scanner doubleScanner = new Scanner(System.in);
                System.out.println("Enter the amount: ");
                while (!doubleScanner.hasNextDouble()) {
                    System.out.println("Enter the amount: ");
                    doubleScanner.nextLine();
                }
                double amount = doubleScanner.nextDouble();
                double result;
                if (str.equals("bn")) {
                    result = amount * 0.8;
                    System.out.println(result);
                } else {
                    result = amount * 1.25;
                    System.out.println(result);
                }
                break;
            }
        }
    }
}
