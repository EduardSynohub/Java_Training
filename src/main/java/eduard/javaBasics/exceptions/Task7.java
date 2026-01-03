package eduard.javaBasics.exceptions;

public class Task7 {
    public static void main(String[] args) {
        String numA = "20";
        String numB = "10";
        String numZero = "0";
        String notNumber = "abc";
        average(numA, numB);
        average(numA, numZero);
        average(notNumber, numZero);
    }

    public static void average(String a, String b) {
        try {
            int numA = Integer.parseInt(a);
            int numB = Integer.parseInt(b);
            System.out.println(numA / numB);
        } catch (NumberFormatException e) {
            System.out.println("Error: one of the values is not a valid integer.");
        } catch ( ArithmeticException e) {
            System.out.println("Error: division by zero is not allowed.");
        } finally {
            System.out.println("End of method.");
        }
    }
}
