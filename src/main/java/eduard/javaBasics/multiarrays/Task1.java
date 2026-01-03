package eduard.javaBasics.multiarrays;

public class Task1 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 44, 5, 23, 46, 76},
                {4, 96, 36, 72, 58},
                {5, 63, 24, 63, 45, 92},
                {9, 10, 29, 31}
        };
        System.out.println(oddSum(array));
    }

    public static int oddSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j % 2 != 0) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
}
