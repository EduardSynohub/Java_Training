package eduard.javaBasics.files;

import eduard.javaBasics.datainput.Task10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Task4.fileCreator("""
                Java
                C
                C++
                C#
                Python
                JavaScript
                PHP
                Visual Basic .NET
                Perl
                Objective-C
                Język asemblera
                Swift
                Ruby
                Visual Basic
                Delphi/Object Pascal
                Go
                Groovy
                R
                MATLAB
                PL/SQL
                """, "Programming_languages");
        String[] programmingLanguages = new String[0];
        File file = new File("Programming_languages.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found while reading.");
        }
        while (scanner.hasNextLine()) {
            programmingLanguages = Task10.addNewElementToArray(programmingLanguages, scanner.nextLine());
        }

        System.out.println(Arrays.toString(Arrays.stream(programmingLanguages).sorted().toArray()));
    }
}
