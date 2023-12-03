package week_13.assignments.Question_13_19;

import week_13.assignments.Question_13_15.RationalForBigNumbers;

import java.math.BigInteger;
import java.util.Scanner;

public class Question_13_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number : ");
        String answer = input.next();
        String[] decimalNumber = answer.split(",");
        RationalForBigNumbers rational =
                new RationalForBigNumbers(new BigInteger(decimalNumber[0] + decimalNumber[1]),
                        new BigInteger((int) Math.pow(10,decimalNumber[1].length()) + ""));

        System.out.println("The fraction number is " + rational);

    }
}
