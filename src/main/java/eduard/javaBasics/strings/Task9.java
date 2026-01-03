package eduard.javaBasics.strings;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        String string = "I love Jzvz";
        char forReplace = 'z';
        char replacement = 'a';
        System.out.println(replaceChar(string, forReplace, replacement));
    }

    public static String replaceChar(String str, char forReplace, char replacement) {
        return str.replace(forReplace, replacement);
    }
}
