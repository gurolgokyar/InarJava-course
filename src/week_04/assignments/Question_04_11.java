package week_04.assignments;

import java.util.Scanner;

public class Question_04_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15): ");
        int answer = input.nextInt();
        char hexValue = 0;
        if (0 <= answer && answer <= 9) {
            hexValue = (char) ('0' + answer);
        } else if (9 < answer && answer < 16) {
            hexValue = (char) ('A' + answer - 10);
        } else {
            System.out.println(answer + " is an invalid input!");
            System.exit(1);
        }
        System.out.println("The hex value is " + hexValue);
    }
}
