package eduard.OOP_and_MYSQL.OOP.constructor;

public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double num1 = 5.0;
        double num2 = 2.5;
        double num3 = 0.0;
        calculator.add(num1, num2);
        calculator.multiply(num1, num2);
        calculator.subtract(num1, num2);
        calculator.divide(num1, num3);
        calculator.printOperations();
        System.out.println("--------------------------");
        calculator.clearOperations();
        calculator.printOperations();
    }
}
