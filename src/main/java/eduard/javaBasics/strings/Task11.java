package eduard.javaBasics.strings;

public class Task11 {
    public static void main(String[] args) {
        String string = "Alfabet";
        int index = 2;
        System.out.println(upperCase(string, index));
    }

    public static String upperCase(String str, int index) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i % index == 0) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();
    }
}
