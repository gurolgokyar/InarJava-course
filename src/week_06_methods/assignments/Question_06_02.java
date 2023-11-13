package week_06_methods.assignments;

import java.util.Scanner;

public class Question_06_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer: ");
        long answer = input.nextLong();

        int sumOfDigits = sumDigits(answer);
        System.out.println("The sum of the digits in " + answer + " is " + sumOfDigits);
    }

    public static int sumDigits(long n) {
        int result = 0;
        while (n > 0) {
            result += (int) n % 10;
            n /= 10;
        }
        return result;
    }

}
