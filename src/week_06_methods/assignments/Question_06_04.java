package week_06_methods.assignments;

import java.util.Scanner;

public class Question_06_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int answer = input.nextInt();

        System.out.println(reverse(answer));
    }

    public static String reverse(int n) {
        String result = "";

        while (n > 0) {
            int digit = n % 10;
            result =  result + digit;

            n /= 10;
        }
        return result;
    }
}
