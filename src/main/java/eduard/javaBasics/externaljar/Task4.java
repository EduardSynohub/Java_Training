package eduard.javaBasics.externaljar;

import org.apache.commons.lang3.StringUtils;

public class Task4 {
    public static void main(String[] args) {
        String palindrome = "Level";
        String notPalindrome = "Sample";
        System.out.println(checkPalindrome(palindrome));
        System.out.println(checkPalindrome(notPalindrome));
    }

    public static boolean checkPalindrome(String str) {
        String reversedString = StringUtils.reverse(str);
        return StringUtils.deleteWhitespace(str).equalsIgnoreCase(StringUtils.defaultString(reversedString));
    }
}
