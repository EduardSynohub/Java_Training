package eduard.OOP_and_MYSQL.OOP.constructor;

import eduard.OOP_and_MYSQL.OOP.inheritance.AdvancedCalculator;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        double num1 = 5.0;
        double num2 = 2.5;
        double num3 = 0.0;
        calculator.add(num1, num2);
        calculator.multiply(num1, num2);
        calculator.subtract(num1, num2);
        calculator.divide(num1, num3);
        calculator.add(num1, num3);
        calculator.multiply(num1, num3);
        calculator.printOperations();

        System.out.println("-------------------------------------");

        calculator.clearOperations();
        calculator.add(num1, num2);
        calculator.printOperations();

        System.out.println("-------------------------------------");

        advancedCalculator.pow(3, 5);
        advancedCalculator.root(16, 4);
        advancedCalculator.printOperations();

        System.out.println("--------------------------------------");

        advancedCalculator.root(3, 6);
        advancedCalculator.pow(5, 2);
        advancedCalculator.printGlobalOperations();
    }
}
