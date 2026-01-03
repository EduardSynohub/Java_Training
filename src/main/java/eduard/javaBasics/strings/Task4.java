package eduard.javaBasics.strings;

public class Task4 {
    public static void main(String[] args) {
        String string2 = "sometexttocheck";
        String toSearch = "to";
        String toSearch2 = "no";
        System.out.println(containsStr(string2, toSearch));
        System.out.println(containsStr(string2, toSearch2));
    }

    public static boolean containsStr(String str, String search) {
        return str.toLowerCase().contains(search);
    }
}
