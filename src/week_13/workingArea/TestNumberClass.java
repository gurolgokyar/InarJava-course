package week_13.workingArea;

import java.math.BigInteger;

public class TestNumberClass {
    public static void main(String[] args) {
        Number number1 = new BigInteger("1234567");
        System.out.println(number1.byteValue());
        System.out.println(number1.intValue());

    }
}
