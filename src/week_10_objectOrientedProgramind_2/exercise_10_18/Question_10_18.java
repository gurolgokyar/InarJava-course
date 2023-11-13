package week_10_objectOrientedProgramind_2.exercise_10_18;

import java.math.BigInteger;

public class Question_10_18 {
    public static void main(String[] args) {
        displayPrimeNumbers(Long.MAX_VALUE);
    }
    public static void displayPrimeNumbers(long number){
        int counter = 0;
        BigInteger bigInteger = new BigInteger(number + "");
        while(counter < 5){
            bigInteger = bigInteger.add(BigInteger.ONE);
            if (isPrime(bigInteger)){
                counter++;
                System.out.println(bigInteger);
            }
        }
    }

    public static boolean isPrime(BigInteger b){
        BigInteger border = new BigInteger(b.sqrt() + "");
        BigInteger divisor = new BigInteger(2 + "");
        while(divisor.compareTo(border) <= 0){
            if (b.remainder(divisor).compareTo(new BigInteger(0 + "")) == 0){
                return false;
            }
            divisor = divisor.add(BigInteger.ONE);
        }
        return true;
    }
}
