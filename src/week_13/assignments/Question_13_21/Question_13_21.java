package week_13.assignments.Question_13_21;

import week_13.assignments.Question_13_14.Rational;

import java.math.BigInteger;
import java.util.Scanner;

public class Question_13_21 {
    public static void main(String[] args) {
        //h = -b / 2a
        //k = c- (a* h *h)

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b and c --> ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        Rational h = new Rational((long) (-1 * b), (long)(2 * a));
        //Rational k = new Rational((long)c, (long)(a * h * h));
    }
}
