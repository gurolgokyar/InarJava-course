package week_12_exceptionHandling.workingArea;

import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
        // There is no exception raised when dividing a floating-point number by 0
        System.out.println(1.3 / 0);
    }
}
