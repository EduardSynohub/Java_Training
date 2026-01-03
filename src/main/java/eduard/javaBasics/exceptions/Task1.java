package eduard.javaBasics.exceptions;

public class Task1 {
    public static void main(String[] args) {
        try {
            System.out.println(factorial(-3));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    static int factorial(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Number is negative or equal 0");
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
