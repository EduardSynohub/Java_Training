package eduard.javaBasics.exceptions;

public class Task4 {
    public static void main(String[] args) {
        int a = 1, b = 0, c;
        try {
            c = a / b;
            System.out.println(c);

        } catch (ArithmeticException ex) {
            System.out.println("Exception");
        }
        catch (Exception ex) {
            System.out.println("Arithmetic Exception: You can't divide by 0");
        }
    }
}
