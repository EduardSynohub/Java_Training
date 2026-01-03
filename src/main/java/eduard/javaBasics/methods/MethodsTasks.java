package eduard.javaBasics.methods;

public class MethodsTasks {
    public static void main(String[] args) {
//        task 1
        int m = 5;
        int index = 3;
        System.out.println(multiply(m, index));

//        task 2
        System.out.println(square(m));

//        task 3
        double pln = 35;
        System.out.format("%.2f%n", convertToUsd(pln));

//        task 4
        String name = "Ewa";
        String surname = "Nowak";
        String nickname = "Evo";
        System.out.println(createName(name, surname, nickname));

//        task 5
        double gross = 1000;
        double vat = 0.23;
        System.out.println(calculateNetto(gross, vat));

//        task 6
        int age1 = 18;
        int age2 = 50;
        int age3 = 5;
        System.out.println(checkMaturity(age1));
        System.out.println(checkMaturity(age2));
        System.out.println(checkMaturity(age3));

//        task 7
        int num1 = 24;
        int num2 = 23;
        System.out.println(checkEvenOdd(num1));
        System.out.println(checkEvenOdd(num2));

//        task 8
        int num3 = 58;
        System.out.println(maxOfThree(num1, num2, num3));

//        task 9
        int goalsTeamAonFieldA = 0;
        int goalsTeamAonFieldB = 3;
        int goalsTeamBonFieldA = 2;
        int goalsTeamBonFieldB = 1;
        System.out.println(footballWin(goalsTeamAonFieldA, goalsTeamBonFieldA, goalsTeamAonFieldB, goalsTeamBonFieldB));

//        task 10
        double dogAge1 = 1.5;
        double dogAge2 = 5;
        System.out.println(dogAge(dogAge1));
        System.out.println(dogAge(dogAge2));

//        task 11
        int num = 5;
        System.out.println(factorial(num));
        System.out.println(factorial(3));

//        task 12
        int a = 15;
        int b = 5;
        int c = 4;
        System.out.println(divisibleBy(a, b));
        System.out.println(divisibleBy(a, c));
    }

//    task 1
    public static int multiply(int multiplier, int index) {
        return multiplier * index;
    }

//    task 2
    public static int square(int num) {
        return (int) Math.pow(num, 2);
    }

//    task 3
    public static double convertToUsd(double pln) {
        return pln/4.04;
    }

//    task 4
    public static String createName(String name, String surname, String nickname) {
        return name + " " + nickname + " " + surname;
    }

//    task 5
    public static double calculateNetto(double gross, double vat) {
        return gross * (1 - vat);
    }

//    task 6
    public static boolean checkMaturity(int age) {
        return age >= 18;
    }

//    task 7
    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

//    task 8
    public static int maxOfThree(int numberOne, int numberTwo, int numberThree) {
        if (numberOne > numberTwo && numberOne > numberThree) {
            return numberOne;
        } else if (numberTwo > numberOne && numberTwo > numberThree) {
            return numberTwo;
        } else {
            return numberThree;
        }
    }

//    task 9
    public static String footballWin(int goalsForTeamAonFieldA, int goalsForTeamBonFieldA, int goalsForTeamAonFieldB, int goalsForTeamBonFieldB) {
        if ((goalsForTeamAonFieldA + goalsForTeamAonFieldB) == (goalsForTeamBonFieldA + goalsForTeamBonFieldB)) {
            if (goalsForTeamAonFieldB > goalsForTeamBonFieldA) {
                return "Wygrał zespół A, bo ma więcej bramek na wyjeździe.";
            } else if (goalsForTeamAonFieldB < goalsForTeamBonFieldA){
                return "Wygrał zespół B, bo ma więcej bramek na wyjeździe.";
            } else {
                return "Remis.";
            }
        } else if ((goalsForTeamAonFieldA + goalsForTeamAonFieldB) > (goalsForTeamBonFieldA + goalsForTeamBonFieldB)) {
            return "Wygrał zespół A.";
        } else {
            return "Wygrał zespół B.";
        }
    }

//    task 10
    public static double dogAge(double dogAge) {
        if (dogAge > 0 && dogAge <=2) {
            return dogAge * 10.5;
        } else {
            return (2 * 10.5) + ((dogAge - 2) * 4);
        }
    }

//    task 11
    public static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

//    task 12
    public static boolean divisibleBy(int a, int b) {
        if (a % b == 0) {
            return true;
        } else {
            return false;
        }
    }
}
