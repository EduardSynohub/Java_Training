package eduard.javaBasics.exceptions;

public class Task3 {
    public static void main(String[] args) {
        try {
            showLength(null);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    static void showLength(String s) {
        if (s == null) {
            throw new NullPointerException("String parametr is null");
        }
        System.out.println(s.length());
    }
}
