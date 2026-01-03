package eduard.javaBasics.exceptions;

import java.util.NoSuchElementException;

public class Task11 {
    public static void main(String[] args) {
        int[] numbers = {1, 23, 45, 33, 94, 54, 52, 323, 12};
        try {
            System.out.println(indexOf(numbers, 12));
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(indexOf(numbers, 20));
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int indexOf(int[] elements, int value) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == value) {
                return i;
            }
        }
        throw new NoSuchElementException("Element not found in array.");
     }
}
