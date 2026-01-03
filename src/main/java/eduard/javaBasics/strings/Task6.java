package eduard.javaBasics.strings;

public class Task6 {
    public static void main(String[] args) {
        String string3 = "Cat";
        String string4 = "reverse";
        System.out.println(reverseString(string3));
        System.out.println(reverseString(string4));
    }

    public static String reverseString(String string) {
        char[] chars = string.toCharArray();
        String result = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            result += chars[i];
        }
        return result;
    }
}
