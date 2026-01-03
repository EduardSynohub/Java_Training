package eduard.introductionToJava;

public class Loops {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 7;
        if (num1>num2) {
            System.out.println("The larger number is: " + num1);
        } else {
            System.out.println("The larger number is: " + num2);
        }

        int num3 = 11;

        if (num1 > num2 && num1 > num3) {
            System.out.println("The greatest number is: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The greatest number is: " + num2);
        } else {
            System.out.println("The greatest number is: " + num3);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Java");
        }
        int j = 0;
        while ( j < 3 ) {
            System.out.println("Java");
            j++;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\b");
        int y = 1;
        while (y <= 10) {
            System.out.print(y + " ");
            y++;
        }

        int resultFor = 0;
        int resultWhile = 0;

        for (int i = 1; i <= 10; i++) {
            resultFor = resultFor + i;
        }
        System.out.println("\n");
        System.out.println(resultFor);
        int x = 1;
        while (x <= 10) {
            resultWhile += x;
            x++;
        }
        System.out.println(resultWhile);

        int n = 6;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " - even");
            } else {
                System.out.println(i + " - odd");
            }
        }

        int z = 0;
        while (z <= n) {
            if (z % 2 == 0) {
                System.out.println(z + " - even");
            } else {
                System.out.println(z + " - odd");
            }
            z++;
        }

        for (int i = 0; i < 3; i++) {
            for (int jj = 0; jj < 3; jj++) {
                System.out.println("i = " + i + " j = " + jj);
            }
        }

        System.out.println("\b");

        int m = 5;

        for (int i = 1; i <= m; i++) {
            String str3 = "";
            for (int j2 = 1; j2 <= m; j2++) {
                if (j2 > i) {
                str3 += j2 + " ";
                } else {
                    str3 += "* ";
                }
            }
            System.out.println(str3);
        }

        for (int i = 5; i > 0; i--) {
            String str3 = "";
            for (int j2 = 1; j2 <= m; j2++) {
                if (j2 > i) {
                    str3 += j2 + " ";
                } else {
                    str3 += "* ";
                }
            }
            System.out.println(str3);
        }

        System.out.println("\b");
        for (int i = 1; i <= m ; i++) {
            String str4 = "";
            for (int j3 = 1; j3 <= m; j3++) {
                if (j3 > i) {
                    str4 += "";
                } else {
                    str4 += "* ";
                }
            }
            System.out.println(str4);
        }
    }
}
