package eduard.introductionToJava;

public class StartUpParametrs {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
            sum += Integer.parseInt(args[i]);
        }

        System.out.println("\n" + sum/ args.length);

        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(args[i] + " ");
        }

        System.out.println("\n");

        int param1 = Integer.parseInt(args[0]);
        int param2 = Integer.parseInt(args[1]);
        int param3 = Integer.parseInt(args[2]);

        if (((param1 + param2) > param3) && ((param2 + param3) > param1) && ((param1 + param3) > param2)) {
            System.out.println("It`s can be a triangle");
        } else {
            System.out.println("It`s can`t be a triangle");
        }

        int points[] = {-15, 30, 45, 51, 80, 102, 73, 99};
        for (int i = 0; i < points.length; i++) {
            if (points[i] > 100 || points[i] < 0) {
                System.out.println("Bad value");
            } else if (points[i] >=0 && points[i] <=50) {
                System.out.println("Grade: F");
            } else if (points[i] >= 51 && points[i] <=70) {
                System.out.println("Grade: E");
            } else if (points[i] >= 71 && points[i] <= 90) {
                System.out.println("Grade: C");
            } else {
                System.out.println("Grade: A");
            }
        }

        System.out.println("\n");

        int number = 5;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.println(i + " x " + j + " = " + i*j);
            }
        }

        System.out.println("\n");

        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(factorial);

        int x = 420;
        int y = 168;
        int nwd = 0;
        for (int i = 1; i <=x && i <= y; i++) {
            if (x % i == 0 && y % i == 0) {
                nwd = i;
            }
        }
        System.out.println(nwd);
    }
}
