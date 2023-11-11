package week_10.exercise_10_19;

import java.math.BigInteger;

public class Question_10_19 {
    public static void main(String[] args) {
        BigInteger b = new BigInteger(2 + "");
        BigInteger c = new BigInteger(2 + "");
        System.out.println("p       2^p - 1");

        for (int i = 2; i <= 100; i++) {
            b = b.multiply(c);
            if (isPrime(b.subtract(BigInteger.ONE))) {
                System.out.printf("%-2d       %d\n" , i,b.subtract(BigInteger.ONE));
            }
        }
    }

    public static boolean isPrime(BigInteger b) {
        BigInteger divisor = new BigInteger("2");
        BigInteger border = new BigInteger(b.sqrt() + "");
        while (divisor.compareTo(border) <= 0) {
            if (b.remainder(divisor).compareTo(new BigInteger("0")) == 0) {
                return false;
            }
            divisor = divisor.add(BigInteger.ONE);
        }
        return true;
    }

}
