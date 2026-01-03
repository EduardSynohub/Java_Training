package eduard.javaBasics.multiarrays;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] multiArray = {
                {1, 2, 3, 4},
                {5, 6, 7},
                {8, 9, 10, 3}
        };
        System.out.println(Arrays.toString(lessMore(multiArray)));
    }

    public static int[] lessMore(int[][] arr) {
        double sum = 0;
        int counter = 0;
        int less = 0;
        int more = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                counter++;
            }
        }
        double average = sum / counter;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < average) {
                    less++;
                } else if (arr[i][j] > average) {
                    more++;
                }
            }
        }
        return new int[]{less, more};
    }
}
