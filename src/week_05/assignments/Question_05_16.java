package week_05.assignments;

import java.util.Scanner;

public class Question_05_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int possibleDivisor = 2;

        while (number > 1) {
            if (number % possibleDivisor == 0) {
                if (number / possibleDivisor == 1) {
                    System.out.print(possibleDivisor + ".");
                } else {
                    System.out.print(possibleDivisor + ", ");
                }
                number /= possibleDivisor;
            } else {
                possibleDivisor++;
            }
        }

    }
}
