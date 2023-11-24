package week_10_objectOrientedThinking.workiningArea;

import java.math.BigInteger;

public class www {
    public static void main(String[] args) {

        BigInteger n = new BigInteger(String.valueOf(Long.MAX_VALUE));
        BigInteger divisor5 = new BigInteger("5");
        BigInteger divisor6 = new BigInteger("6");
        BigInteger zero = new BigInteger("0");

        int count = 0;
        System.out.println("First ten numbers greater than Long.MAX_VALUE that are divisible by 5 or 6:");
        while (count < 10) {
            n = n.add(BigInteger.ONE);
            if (zero.compareTo(n.remainder(divisor5)) == 0 || zero.compareTo(n.remainder(divisor6)) == 0) {
                System.out.println(n);
                count++;
            }
        }
        String s = "db";
        String s2 = "abk";
        System.out.println(s.compareTo(s2));
    }
}
