package week_10.exercise_10_16;

import java.math.BigInteger;

public class Question_10_16 {
    public static void main(String[] args) {
        String number = "1";
        for (int i = 0; i < 49; i++) {
            number += "0";
        }
        BigInteger number1 = new BigInteger(number);
        displayBigIntegers(number1);
    }

    public static void displayBigIntegers(BigInteger number){
        int counter = 0;
        BigInteger divisor1 = new BigInteger("2");
        BigInteger divisor2 = new BigInteger("3");
        BigInteger toAddNumber = new BigInteger("1");
        while(counter < 10){
            if (number.remainder(divisor1).equals(new BigInteger("0")) || number.remainder(divisor2).equals(new BigInteger("0"))){
                System.out.println(number);
                counter++;
            }
            number = number.add(toAddNumber);
        }
    }
}
