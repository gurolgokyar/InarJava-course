package week_10_objectOrientedProgramind_2.exercise_10_21;

import java.math.BigInteger;

public class Question_10_21 {
    public static void main(String[] args) {
        System.out.println("First ten numbers greater than Long.MAX_VALUE that are divisible by 5 or 6: ");

        BigInteger b = new BigInteger(Long.MAX_VALUE + "");
        BigInteger divisor1 = new BigInteger("5");
        BigInteger divisor2 = new BigInteger("6");
        BigInteger c = new BigInteger("0");

        int counter = 0;
        while(counter < 10){
            if (b.remainder(divisor1).equals(c) || b.remainder(divisor2).equals(c)){
                System.out.println(b);
                counter++;
            }
            b = b.add(BigInteger.ONE);
        }
    }
}
