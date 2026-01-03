package eduard.javaBasics.multiarrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[][] array = {
                {1, 3, 4, 5},
                {12, 34, 8, 6},
                {23, 28, 7, 53},
                {35, 74, 85, 44}
        };
        System.out.println(array[0][2]);
        System.out.println(array[1][0]);
        System.out.println(array[2][1]);
        System.out.println(array[0].length);
        System.out.println(array[1].length);
        System.out.println(array[2].length);

        int sum = 0;
        int matrix = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                System.out.print(array[i][j] + ", ");
                if (i == j) {
                    matrix += array[i][j];
                }
            }
        }
        System.out.println("\n" + sum);
        System.out.println(matrix);
    }
}
