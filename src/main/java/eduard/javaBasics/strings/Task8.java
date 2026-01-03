package eduard.javaBasics.strings;

public class Task8 {
    public static void main(String[] args) {
        String string5 = "AbfdnHDHJfdjIDHdh";
        System.out.println(toggleChar(string5));
    }

    public static String toggleChar(String str) {
        String result = "";
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                result += Character.toLowerCase(chars[i]);
            } else {
                result += Character.toUpperCase(chars[i]);
            }
        }
        return result;
    }
}
