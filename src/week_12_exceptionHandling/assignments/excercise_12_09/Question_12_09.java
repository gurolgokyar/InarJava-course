package week_12_exceptionHandling.assignments.excercise_12_09;

import java.util.Scanner;

public class Question_12_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String binaryString = input.next();

        try {
            System.out.println("The decimal value for binary number " + binaryString + " is " + bin2Dec(binaryString));
        } catch (BinaryFormatException ex) {
            System.out.println(ex);
        }
    }

    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        int sum = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            char ch = binaryString.charAt(i);
            if (isBinaryNumber(ch)) {
                sum = sum * 2 + ch - '0';
            }else {
                throw new BinaryFormatException("It is not a binary string!");
            }
        }
        return sum;
    }

    public static boolean isBinaryNumber(char ch) {
        return ch == '0' || ch == '1';
    }
}
