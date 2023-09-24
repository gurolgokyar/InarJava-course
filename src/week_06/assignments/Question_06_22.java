package week_06.assignments;

import java.util.Scanner;

public class Question_06_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double answer = input.nextDouble();

        double squareRoot = sqrt(answer);
        System.out.println("The approximated root of " + answer + " is " + squareRoot);

    }

    public static double sqrt(double n) {
        double lastGuess = 10;
        double nextGuess = (lastGuess + n / lastGuess) / 2;
        while (Math.abs(nextGuess - lastGuess) > 0.0001) {
            lastGuess =Math.abs(nextGuess - lastGuess);
            nextGuess = (lastGuess + n / lastGuess) / 2;
        }
        return nextGuess;
    }
}
