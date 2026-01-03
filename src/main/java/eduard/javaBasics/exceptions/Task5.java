package eduard.javaBasics.exceptions;

public class Task5 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("5");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("A comment that will always remain");
        }
    }
}
