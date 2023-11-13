package week_04_StringsAndCharacters.assignments;

import java.util.Scanner;

public class Question_04_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String answer = input.nextLine();
        char letter = answer.charAt(0);

        if (answer.length() != 1 || !Character.isLetter(letter)) {
            System.out.println(answer + " is an invalid input!");
            System.exit(1);
        }
        int correspondingNumber = 2;

        //Find the corresponding number for upper case
        if (Character.isUpperCase(letter)) {
            if (letter >= 'S') {
                if (letter == 'Z') {
                    correspondingNumber += (letter - ('A' + 2)) / 3;
                } else {
                    correspondingNumber += (letter - ('A' + 1)) / 3;
                }
            } else {
                correspondingNumber += (letter - ('A')) / 3;
            }

           //Now find the corresponding number for upper case
        } else {
            if ((letter >= 's')) {
                if (letter == 'z') {
                    correspondingNumber += (letter - ('a' + 2)) / 3;
                } else {
                    correspondingNumber += (letter - ('a' + 1)) / 3;
                }
            } else {
                correspondingNumber += (letter - 'a') / 3;
            }
        }

        System.out.println("The corresponding number is " + correspondingNumber);
    }
}
