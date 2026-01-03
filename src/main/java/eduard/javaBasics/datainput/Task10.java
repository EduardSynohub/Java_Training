package eduard.javaBasics.datainput;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(retirement()));
    }

    public static String[] retirement() {
        String[] people = new String[0];
        int year = LocalDate.now().getYear();
        String[] retirementPeople = new String[0];
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter last name, first name, year of birth and gender.\n" +
                    "Sample: Kowalski Jan 1888 M: ");
            String s = scanner.nextLine();
            if (s.equals("quit")) {
                break;
            }
            people = addNewElementToArray(people, s);
        }
        for (String person : people) {
            String[] splitData = person.split(" ");
            if (splitData[splitData.length - 1].equals("M")) {
                if (year - (Integer.parseInt(splitData[splitData.length - 2])) >= 65) {
                    retirementPeople = addNewElementToArray(retirementPeople, person);
                }
            } else if (splitData[splitData.length - 1].equals("F")) {
                if (year - Integer.parseInt(splitData[splitData.length - 2]) >= 60) {
                    retirementPeople = addNewElementToArray(retirementPeople, person);
                }
            }
        }
        return retirementPeople;
    }

    public static String[] addNewElementToArray(String[] array, String element) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = element;
        return array;
    }
}
