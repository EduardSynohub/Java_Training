package eduard.javaBasics.strings;

public class Task1 {
    public static void main(String[] args) {
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";
        char secondToLastChar = str.charAt(str.length() - 2);
        char[] charArr = str.toLowerCase().toCharArray();
        int counter = 0;
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == secondToLastChar) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
