package eduard.javaBasics.strings;

public class Task3 {
    public static void main(String[] args) {
        String string1 = "sometext";
        System.out.println(firstHalf(string1));
    }

    public static String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }
}
