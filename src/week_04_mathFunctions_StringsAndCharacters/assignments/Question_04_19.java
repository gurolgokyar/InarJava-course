package week_04_mathFunctions_StringsAndCharacters.assignments;

import java.util.Scanner;

public class Question_04_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as an integer: ");
        String first9Digits = input.nextLine();
        int digit1 = first9Digits.charAt(0) - '0';
        int digit2 = first9Digits.charAt(1) - '0';
        int digit3 = first9Digits.charAt(2) - '0';
        int digit4 = first9Digits.charAt(3) - '0';
        int digit5 = first9Digits.charAt(4) - '0';
        int digit6 = first9Digits.charAt(5) - '0';
        int digit7 = first9Digits.charAt(6) - '0';
        int digit8 = first9Digits.charAt(7) - '0';
        int digit9 = first9Digits.charAt(8) - '0';

        if (first9Digits.length() != 9 || digit1 != 0 || (Character.isDigit(digit2) || Character.isDigit(digit3)
                || Character.isDigit(digit4) || Character.isDigit(digit5) || Character.isDigit(digit6) ||
                Character.isDigit(digit7) || Character.isDigit(digit8) || Character.isDigit(digit9))) {
            System.out.println("Invalid input!");
            System.exit(1);
        }

        //Find the digit 10
        int digit10 =
                (digit2 * 2 + digit3 * 3 + digit4 * 4 + digit5 * 5 + digit6 * 6 + digit7 * 7 + digit8 * 8 + digit9 * 9) % 11;
        char digit_10;
        if (digit10 == 10) {
            digit_10 = 'x';
        } else {
            digit_10 = (char) ('0' + digit10);
        }

        //Display the results
        System.out.println("The ISBN-10 number is " + first9Digits + digit_10);
    }
}
