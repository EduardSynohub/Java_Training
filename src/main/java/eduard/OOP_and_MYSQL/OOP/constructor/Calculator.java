package eduard.OOP_and_MYSQL.OOP.constructor;


import java.util.Arrays;

public class Calculator {
    protected String[] historyOfOperations;

    public Calculator() {
        historyOfOperations = new String[0];
    }

    public double add(double number1, double number2) {
        double result = number1 + number2;
        String saveToHistory = "added " + number1 + " to " + number2 + " got " + result;
        autoIncrement(saveToHistory);
        return result;
    }

    public double multiply (double number1, double number2) {
        double result = number1 * number2;
        String saveToHistory = "multiplied " + number1 + " with " + number2 + " got " + result;
        autoIncrement(saveToHistory);
        return result;
    }

    public double subtract (double number1, double number2) {
        double result = number2 - number1;
        String saveToHistory = "subtracted " + number2 + " from " + number1 + " got " + result;
        autoIncrement(saveToHistory);
        return  result;
    }

    public double divide (double number1, double number2) {
        double result = number1 / number2;
        String saveToHistory = "divided " + number1 + " by " + number2 + " got " + result;
        autoIncrement(saveToHistory);
        return result;
    }

    private void autoIncrement (String element) {
        historyOfOperations = Arrays.copyOf(historyOfOperations, historyOfOperations.length + 1);
        historyOfOperations[historyOfOperations.length - 1] = element;
    }

    public void printOperations() {
        for (String s : historyOfOperations) {
            System.out.println(s);
        }
    }

    public void clearOperations() {
        historyOfOperations = new String[0];
    }

    public String[] getHistoryOfOperations() {
        return historyOfOperations;
    }
}
