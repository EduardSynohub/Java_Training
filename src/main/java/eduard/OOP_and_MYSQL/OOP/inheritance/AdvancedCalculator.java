package eduard.OOP_and_MYSQL.OOP.inheritance;

import eduard.OOP_and_MYSQL.OOP.constructor.Calculator;

public class AdvancedCalculator extends Calculator {
    public double pow (double number1, double number2) {
        double result = Math.pow(number1, number2);
        String saveToHistory = number1 + "^" + number2 + " equals " + result;
        autoIncrement(saveToHistory);
        return result;
    }

    public double root(double number1, double number2) {
        double result = Math.pow(number1, (1 / number2));
        String saveToHistory = number2 + " root of " + number1 + " equals " + result;
        autoIncrement(saveToHistory);
        return result;
    }
}
