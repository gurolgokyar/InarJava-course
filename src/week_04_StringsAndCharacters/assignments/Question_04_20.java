package week_04_StringsAndCharacters.assignments;

import java.util.Scanner;

public class Question_04_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        int length = s.length();
        char firstCharacter = s.charAt(0);

        System.out.println("Length of the string: " + length);
        System.out.println("First character of the string: " + firstCharacter);
    }
}
