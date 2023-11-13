package week_10_objectOrientedProgramind_2.workiningArea.Integer;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegers {
    public static void main(String[] args) {
//        BigInteger a = new BigInteger("9223372036854775807");
//        BigInteger b = new BigInteger("2");
//        BigInteger c = a.multiply(b);
//        System.out.println(c);
//
//        BigInteger d = new BigInteger("18446744073709551614");
//        System.out.println(c.compareTo(d));

        BigDecimal f = new BigDecimal(22);
        BigDecimal g = new BigDecimal(7);
        System.out.println(f.divide(g,10,BigDecimal.ROUND_UP));
        System.out.println(Math.PI);
        System.out.println("--------------------------------");
        BigInteger k = new BigInteger("22");
        BigInteger l = new BigInteger("7");
        System.out.println(k.divide(l));

        System.out.println("---------------------------------");
        BigInteger m = new BigInteger("1");
        for (int i = 1; i < 50; i++) {
            m = m.multiply(new BigInteger(i + ""));
        }
        System.out.println(m);

    }
}
