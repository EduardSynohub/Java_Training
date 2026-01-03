package eduard.javaBasics.files;

import java.io.File;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println(checkFileExists());
    }

    public static boolean checkFileExists() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of file to find:");
        String nameOfFile = scanner.nextLine();
        File file = new File(nameOfFile + ".txt");
        return file.exists();
    }
}
