package week_12_exceptionHandling.assignments.excercise_12_06;

import java.util.Scanner;

public class Question_12_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex number: ");
        String hexNumber = input.next().toUpperCase();

        try {
            int decimalValue = hexToDecimal(hexNumber);
            System.out.println("The decimal value for hex number " + hexNumber + " is " + decimalValue);
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int hexToDecimal(String hexString) throws NumberFormatException {
        int sum = 0;
        for (int i = hexString.length() - 1, pow = 0; i >= 0; i--, pow++) {
            char ch = hexString.charAt(i);
            if (isHexDigit(ch)) {
                if (Character.isDigit(ch)) {
                    sum += (ch - '0') * (int)Math.pow(16, pow);
                } else {
                    sum += (10 + ch - 'A') * (int)Math.pow(16,pow);
                }
            } else {
                throw new NumberFormatException("It is not hex string!");
            }
        }
        return sum;
    }

    public static boolean isHexDigit(char ch) {
        return Character.isDigit(ch) || (ch >= 'A' && ch <= 'F');
    }
}
