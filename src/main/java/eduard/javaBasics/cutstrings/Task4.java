package eduard.javaBasics.cutstrings;

public class Task4 {
    public static void main(String[] args) {
        String[] strings = {"Some", "text", "to", "checking", "method"};
        String string = " ";
        System.out.println(joinStrings(strings, string));
    }

    public static String joinStrings(String[] strings, String separator) {
        return String.join(separator, strings);
    }
}
