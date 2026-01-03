package eduard.javaBasics.strings;

public class Task5 {
    public static void main(String[] args) {
        String[] strings = {"John", "have", "a", "dog"};
        System.out.println(stringFromArray(strings));
    }

    public static String stringFromArray(String[] str) {
        return String.join(" ", str);
    }
}
