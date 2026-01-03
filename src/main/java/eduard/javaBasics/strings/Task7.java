package eduard.javaBasics.strings;

public class Task7 {
    public static void main(String[] args) {
        String palindrome = "level";
        String palindrome1 = " A to kanapa pana kota";
        String palindrome2 = "Welcome";
        System.out.println(isPalindrome(palindrome));
        System.out.println(isPalindrome(palindrome1));
        System.out.println(isPalindromeVersion2(palindrome1));
        System.out.println(isPalindromeVersion2(palindrome));
        System.out.println(isPalindrome(palindrome2));
        System.out.println(isPalindromeVersion2(palindrome2));
    }

    public static boolean isPalindrome(String string) {
        string = string.trim().toLowerCase().replaceAll(" ", "");
        String str = Task6.reverseString(string);
        return string.equals(str);
    }

    public static boolean isPalindromeVersion2(String string) {
        string = string.trim().toLowerCase().replaceAll(" ", "");
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
