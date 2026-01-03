package eduard.javaBasics.exceptions;

public class Task2 {
    public static void main(String[] args) {
        try {
            int[] tab = {5, 1, 6, 7, 9};
            System.out.println(tab[34]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
