package week_13.assignments.Question_13_18;

import week_13.assignments.Question_13_14.Rational;
import week_13.assignments.Question_13_15.RationalForBigNumbers;

import java.math.BigInteger;

public class Question_13_18 {
    public static void main(String[] args) {
        RationalForBigNumbers sum = new RationalForBigNumbers(BigInteger.ZERO, new BigInteger("1"));

        for (int i = 1; i < 100; i++) {
            RationalForBigNumbers number = new RationalForBigNumbers(new BigInteger("" + i),
                    new BigInteger("" + (1 + i)));
            sum = sum.add(number);
        }
        System.out.println("The result is --> " + sum);
    }
}
