package eduard.javaBasics.strings;

public class Task14 {
    public static void main(String[] args) {
        String secretCode = "EbiilTloia";
        int shift = 3;
        System.out.println(encodeCaesar(secretCode, shift));
    }

    public static String encodeCaesar(String string, int shift) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                stringBuilder.append((char) ((chars[i] - 65 + shift) % 26 + 65));
            } else {
                stringBuilder.append((char) ((chars[i] - 97 + shift) % 26 + 97));
            }
        }
        return stringBuilder.toString();
    }
}
