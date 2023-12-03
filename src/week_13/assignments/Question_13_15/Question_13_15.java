package week_13.assignments.Question_13_15;

import java.math.BigInteger;

public class Question_13_15 {
    public static void main(String[] args) {
        BigInteger number1 = new BigInteger("5");
        BigInteger number2 = new BigInteger("6");
        RationalForBigNumbers rational1 = new RationalForBigNumbers(number1,number2);

        BigInteger number3 = new BigInteger("4");
        RationalForBigNumbers rational2 = new RationalForBigNumbers(BigInteger.ONE, number3);

        System.out.println(rational1 + " + " + rational2 + " = " + rational1.add(rational2));
        System.out.println(rational1 + " - " + rational2 + " = " + rational1.subtract(rational2));
        System.out.println(rational1 + " * " + rational2 + " = " + rational1.multiply(rational2));
        System.out.println(rational1 + " / " + rational2 + " = " + rational1.divide(rational2));
        System.out.println(rational2 + " is " + rational2.doubleValue());

    }
}
