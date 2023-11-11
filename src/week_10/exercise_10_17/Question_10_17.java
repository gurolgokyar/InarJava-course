package week_10.exercise_10_17;

import java.math.BigInteger;

public class Question_10_17 {
    public static void main(String[] args) {
        BigInteger number = new BigInteger(Long.MAX_VALUE + "");
        long number1 = number.sqrt().longValue();
        displayNumbers(number1);
    }

    public static void displayNumbers(long number) {
        BigInteger b = new BigInteger(number + "");
        for (int i = 1; i <= 10; i++) {
            b = b.add(BigInteger.ONE);
            System.out.println(b.pow(2));
        }
    }
}
