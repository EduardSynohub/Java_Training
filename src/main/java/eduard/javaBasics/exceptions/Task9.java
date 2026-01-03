package eduard.javaBasics.exceptions;

public class Task9 {
    public static void main(String[] args) {
        String text = "blablabla";
        String nullString = null;
        System.out.println(getLength(text));
        try {
            System.out.println(getLength(nullString));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int getLength(String str) {
        if (str == null) {
            throw new NullPointerException("Cannot get the length of this string because it is null.");
        }
        return str.length();
    }
}
