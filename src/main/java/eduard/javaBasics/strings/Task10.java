package eduard.javaBasics.strings;

public class Task10 {
    public static void main(String[] args) {
        String mainString = "Some text for testing method";
        String string1 = "test";
        String string2 = "wrap";
        System.out.println(replaceStr(mainString, string1, string2));
    }

    public static String replaceStr(String str, String forReplace, String replacement) {
        return str.replaceAll(forReplace, replacement);
    }
}
