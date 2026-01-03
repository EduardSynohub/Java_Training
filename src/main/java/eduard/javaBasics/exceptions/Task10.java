package eduard.javaBasics.exceptions;

public class Task10 {
    public static void main(String[] args) {
        String text = "not number";
        String numberString = "13";
        try {
            System.out.println(toInt(text));
        } catch (NumberFormatException e) {
            System.out.println("It must be a number, not text.");
        }
        System.out.println(toInt(numberString));
    }

    public static int toInt(String str) {
        return Integer.parseInt(str);
    }
}
