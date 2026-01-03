package eduard.introductionToJava;

import java.util.Locale;

public class Arrays {
    public static void main(String[] args) {
        int threeElements [] = {3, 5, 7};
        for (int i = 0; i < threeElements.length; i++) {
            System.out.print(threeElements[i] + ", ");
        }
        System.out.println(threeElements[threeElements.length - 1]);

        int numbers [] = {4, 643, 112, 9999, 69};
        int sum = 0;
        int sumOdd = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if ((numbers[i] % 2) == 0) {
                System.out.println(numbers[i]);
            } else {
                sumOdd += numbers[i];
            }
        }
        System.out.println(sumOdd);
        System.out.println(sum);

        int numbers2 []= {4, 643, 112, 9999, -69};
        int min = numbers2[0];
        for ( int i = 0; i < numbers2.length; i++) {
            if (numbers2[i] < min) {
                min = numbers2[i];
            }
        }
        for (int i = numbers2.length - 1; i >= 0; i--) {
            System.out.println(numbers2[i]);
        }
        System.out.println("MIN: " + min);

        double[] temps = {30, 29, 14, 42, -4, -10, 8, 14, 32, 11, 8, 0, 0};
        double avr = 0;
        double sumForAvr = 0;
        for (int i = 0; i < temps.length; i++) {
            temps[i] = temps[i] * 1.8 + 32;
            sumForAvr += temps[i];
        }
        avr = sumForAvr / temps.length;
        System.out.println(String.format(Locale.ENGLISH, "%.2f", avr));
    }
}
