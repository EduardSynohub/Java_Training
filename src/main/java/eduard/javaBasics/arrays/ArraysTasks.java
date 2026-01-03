package eduard.javaBasics.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysTasks {
    public static void main(String[] args) {
//        task 1
        int [] mainTab = new int[50];
        for (int i = 0; i < mainTab.length; i++) {
            mainTab[i] = i;
            }
        int counter = 0;
        for (int i = 0; i < mainTab.length; i++) {
            if (i < 10) {
                System.out.print("0" + mainTab[i] + ", ");
            } else {
                System.out.print(mainTab[i] + ", ");
            }
            counter++;
            if (counter == 10) {
                System.out.println("\b");
                counter = 0;
            }
        }

//        task 2
        int min = 246000000;
        int [] randNumbers = new int[20];
        Random random = new Random();
        for (int i = 0; i < randNumbers.length; i++) {
            randNumbers[i] = random.nextInt(101);
            if (randNumbers[i] < min) {
                min = randNumbers[i];
            }
        }
        System.out.println(min);

//        task 3
        int [] tenElements = new int[10];
        Arrays.fill(tenElements, 2);
        System.out.println(Arrays.toString(tenElements));

//        task 4
        int [] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1001);
        }
        int [] reverse = new int[10];
        for (int i = numbers.length - 1; i >= 0; i--) {
            reverse[i] = numbers[numbers.length - 1 - i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(reverse));

//        task 5
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

//        task 6
        int [] secondNumbers = new int[10];
        int [] sumArray = new int[10];
        for (int i = 0; i < secondNumbers.length; i++) {
            secondNumbers[i] = random.nextInt(1001);
            sumArray[i] = numbers[i] + secondNumbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(secondNumbers));
        System.out.println(Arrays.toString(sumArray));

//        task 7
        int [] arr1 = {1, 2, 3};
        int [] arr2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(append(arr1)));
        System.out.println(Arrays.toString(append(arr2)));

//        task 8
        int element1 = 3;
        int element2 = 6;
        System.out.println(contains(arr1, element1));
        System.out.println(contains(arr1, element2));

//        task 9
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 45, 45, 56, 1};
        System.out.println(Arrays.toString(returnUnique(arr)));
    }

//    task 7
    public static int[] append(int[] arr) {
        int [] newArr = Arrays.copyOf(arr, arr.length * 2);
        for (int i = 0; i < arr.length; i++) {
            newArr[newArr.length - 1 - i] = arr[i];
        }
        return newArr;
    }
//    task 8
    public static boolean contains(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return true;
            }
        }
        return false;
    }

//    task 9
    public static int[] returnUnique(int[] arr) {
        int[] newArr = {arr[0]};
        for (int i = 0; i < arr.length; i++) {
                if (!contains(newArr, arr[i])) {
                    newArr = addAnElementToTheArray(newArr, arr[i]);
                }
        }
        return newArr;
    }

    public static int[] addAnElementToTheArray(int[] array, int elementToAdd) {
        int[] newArr = Arrays.copyOf(array, array.length + 1);
        newArr[newArr.length - 1] = elementToAdd;
        return newArr;
    }
}
