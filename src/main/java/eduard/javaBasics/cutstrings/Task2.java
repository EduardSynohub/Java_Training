package eduard.javaBasics.cutstrings;

public class Task2 {
    public static void main(String[] args) {
        String string = " Some text for checking method ";
        System.out.println(countTokens(string));
    }

    public static int countTokens(String str) {
        str = str.trim();
        String[] parts = str.split(" ");
        return parts.length;
    }
}
