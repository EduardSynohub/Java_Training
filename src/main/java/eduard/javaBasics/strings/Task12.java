package eduard.javaBasics.strings;

public class Task12 {
    public static void main(String[] args) {
        String string = "aaawsxbbb";
        String string1 = "ddfgiiidnds";
        String string2 = "mslpsdgtttt";
        String string3 = "dskdfncorrrrrdhdjvnrrrr";
        System.out.println(tripple(string));
        System.out.println(tripple(string1));
        System.out.println(tripple(string2));
        System.out.println(tripple(string3));
    }

    public static int tripple(String str) {
        char[] chars = str.toCharArray();
        int counter = 0;
        for (int i = 0; i < chars.length - 2; i++) {
            if (chars[i] == chars[i + 1] && chars[i] == chars[i + 2]) {
                counter++;
                i = i + 2;
            }
        }
        return counter;
    }
}
