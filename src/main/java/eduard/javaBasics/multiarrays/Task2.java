package eduard.javaBasics.multiarrays;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[][] multiArray = {
                {1, 2, 3, 4},
                {5, 6, 7},
                {8, 9, 10, 3}
        };
        System.out.println(Arrays.toString(minimum(multiArray)));
    }

    public static int[] minimum(int[][] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i][0];
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
            result[i] = min;
        }
        return result;
    }
}
