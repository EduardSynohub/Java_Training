package eduard.javaBasics.cutstrings;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        String string = "Some-text-to-checking-method";
        System.out.println(Arrays.toString(onlyTwoElements(string, '-')));
    }

    public static String[] onlyTwoElements(String str, char separator) {
        return str.split(String.valueOf(separator), 2);
    }
}
