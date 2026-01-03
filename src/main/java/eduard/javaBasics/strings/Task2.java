package eduard.javaBasics.strings;

public class Task2 {
    public static void main(String[] args) {
        String string = "coding";
        char ch = 'a';
        char ch2 = 'i';
        System.out.println(charPos(string, ch));
        System.out.println(charPos(string, ch2));
    }

    public static int charPos(String str, char c) {
        return str.indexOf(c);
    }
}
