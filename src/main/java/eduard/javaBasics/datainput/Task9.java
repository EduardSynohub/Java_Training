package eduard.javaBasics.datainput;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        try {
            System.out.println(Arrays.toString(sortedArray()));
        } catch (NegativeArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int[] sortedArray() {
        System.out.println("How many numbers should be generated?: ");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("How many numbers should be generated?: ");
        }
        int generatedNumbers = scanner.nextInt();
        if (generatedNumbers <= 0) {
            throw new NegativeArraySizeException("The number of values should be greater than 0.");
        }
        Random r = new Random();
        int[] numbers = new int[generatedNumbers];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(1, 101);
        }
        return Arrays.stream(numbers).sorted().toArray();
    }
}
