package week_10_objectOrientedThinking.exercise_10_20;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Question_10_20 {
    public static void main(String[] args) {
        System.out.println("The values for i = 100 to 1000 :");
        System.out.println("i              e\n----------------------------------------");
        for (int i = 100; i <= 1_000; i += 100) {
            System.out.printf("%-4d     %s\n" ,i ,getApproximateE(i));
        }
    }
    public static BigDecimal getApproximateE(int i){
        BigDecimal result = new BigDecimal("1");
        for (int j = 1; j <= i; j++) {
            BigDecimal denominator = new BigDecimal("1");
            for (int k = 1; k <= j; k++) {
                denominator = denominator.multiply(new BigDecimal(k));
            }
            result = result.add(new BigDecimal(1).divide(denominator,25, RoundingMode.UP));
        }
        return result;
    }
}
