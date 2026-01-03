package eduard.javaBasics.cutstrings;

public class Task1 {
    public static void main(String[] args) {
        String string = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";
        String[] parts = string.split(" ");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
