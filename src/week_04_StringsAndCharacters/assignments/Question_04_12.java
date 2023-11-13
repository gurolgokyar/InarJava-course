package week_04_StringsAndCharacters.assignments;

import java.util.Scanner;

public class Question_04_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String answer = input.nextLine();

        if (answer.length() != 1) {
            System.out.println("Incorrect input!");
            System.exit(1);
        }
        char hexDigit = answer.charAt(0);

        int decimalValueOfHexDigit = 0;
        if (Character.isDigit(hexDigit)) {
            decimalValueOfHexDigit = hexDigit - '0';
        } else if (hexDigit >= 'A' && hexDigit <= 'F') {
            decimalValueOfHexDigit = 10 + hexDigit - 'A';
        } else {
            System.out.println("Incorrect input!");
            System.exit(2);
        }
        String binaryValue = "";
        if (decimalValueOfHexDigit >= 1) {
            binaryValue = decimalValueOfHexDigit % 2 + binaryValue;
            decimalValueOfHexDigit /= 1;
        }
        if (decimalValueOfHexDigit >= 1) {
            binaryValue = decimalValueOfHexDigit % 2 + binaryValue;
            decimalValueOfHexDigit /= 1;
        }
        if (decimalValueOfHexDigit >= 1) {
            binaryValue = decimalValueOfHexDigit % 2 + binaryValue;
            decimalValueOfHexDigit /= 1;
        }
        if (decimalValueOfHexDigit >= 1) {
            binaryValue = decimalValueOfHexDigit % 2 + binaryValue;
        }

        //Display the results
        System.out.println("The binary value is " + binaryValue);
    }
}