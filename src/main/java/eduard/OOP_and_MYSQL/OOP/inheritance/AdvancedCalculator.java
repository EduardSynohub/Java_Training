package eduard.OOP_and_MYSQL.OOP.inheritance;

import eduard.OOP_and_MYSQL.OOP.constructor.Calculator;

public class AdvancedCalculator extends Calculator {
    protected static double PI = 3.14159265;
    public double pow (double number1, double number2) {
        double result = Math.pow(number1, number2);
        String saveToHistory = number1 + "^" + number2 + " equals " + result;
        addToGlobalHistory(saveToHistory);
        return result;
    }

    public double root(double number1, double number2) {
        double result = Math.pow(number1, (1 / number2));
        String saveToHistory = number2 + " root of " + number1 + " equals " + result;
        addToGlobalHistory(saveToHistory);
        return result;
    }

    protected static double computeCircleArea(double r) {
        double result = PI * r * r;
        addToGlobalHistory("The area of a circle with a given radius of " + r + " equals " + result);
        return result;
    }

    public static void printGlobalOperations(int length) {
        int count = 0;

        for (int i = globalHistoryOfOperations.length - 1; i >= 0; i--) {
            if (count == length) {
                break;
            } else {
                System.out.println(globalHistoryOfOperations[i]);
                count++;
            }
        }
    }
}
