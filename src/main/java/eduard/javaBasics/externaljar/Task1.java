package eduard.javaBasics.externaljar;

import org.apache.commons.lang3.StringUtils;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(reverseString("reverse"));
    }

    public static String reverseString(String str) {
        return StringUtils.reverse(str);
    }
}
