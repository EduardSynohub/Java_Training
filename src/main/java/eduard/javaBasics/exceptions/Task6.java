package eduard.javaBasics.exceptions;

public class Task6 {
    public static void main(String[] args) {
        int a = 5, b = 0;
        try {
            System.out.println(divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }

    static int divide (int a, int b) throws ArithmeticException {
        return a / b;
    }
}
