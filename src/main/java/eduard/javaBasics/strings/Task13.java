package eduard.javaBasics.strings;

public class Task13 {
    public static void main(String[] args) {
        System.out.println((int) 'a');
        String string = "Hgln";
        System.out.println(encode(string));
        String s = "a";
        System.out.println(encode(s));
        System.out.println(encode("z"));
        System.out.println(encode("khoor"));
        System.out.println(encode("zruog"));
    }

    public static String encode(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = str.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] - 3 <= 96) {
                chars[i] = (char) (chars[i] - 3 + 26);
            } else {
                chars[i] = (char) (chars[i] - 3);
            }
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();
    }
}
