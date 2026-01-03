package eduard.javaBasics.exceptions;

public class Task8 {
    public static void main(String[] args) {
        String[] strings = {"abc", "bcd", "dce", "ggrf", "kfi"};
        int index = 7;
        int index2 = 3;
        System.out.println(safeGet(strings, index2));
        try {
            System.out.println(safeGet(strings, index));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String safeGet(String[] strTab, int index) {
        if (index > strTab.length || index < 0) {
            throw new ArrayIndexOutOfBoundsException("There is no element in the array at this index.");
        }
            return strTab[index];
    }
}
