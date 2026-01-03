package eduard.introductionToJava;


public class TrainingTasks {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello java" + "\n" + "Hello world");
        String firstWord = "Hello";
        String secondWord = "world";
        System.out.println(firstWord + " " + secondWord);
        System.out.println("Testowanie" + "\r" + "Test");

        int num1 = 1;
        System.out.println(num1);
        int num2 = ++num1;
        System.out.println(num2);
        System.out.println(++num2);
        System.out.println(num2++);
        System.out.println(num2);

        byte numeByte = 94;
        short numShort = 257;
        int sum = numeByte + numShort;
        System.out.println(sum);

        int num3 = 5;
        int num4 = 3;
        int result = num3%num4;
        System.out.println(result);

        String str1 = "Java";
        String str2 = "courses";
        String joinedString = str1 + " " + str2;
        System.out.println(joinedString);

        int month = 3;
        String monthString;
        switch (month) {
            case 1:   monthString = "Styczeń";
                break;
            case 2:   monthString = "Luty";
                break;
            case 3:   monthString = "Marzec";
                break;
            default:  monthString = "Niepoprawny";
                break;
        }
        System.out.println(monthString);

        int ii = 0;
        while (ii < 5) {
            System.out.println("ii = " + ii);
            ii++;
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i=" + i + " j=" + j);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.println("i=" + i + " j=" + j);
            }
        }


    }
}
