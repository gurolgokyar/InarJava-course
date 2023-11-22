package week_12_exceptionHandling.assignments.excercise_12_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_12_02 {
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        boolean isInputsTrue = false;
        do {
            try {
                number1 = input.nextInt();
                number2 = input.nextInt();
                isInputsTrue = true;
            } catch (InputMismatchException ex) {
                System.out.println(ex);
                System.out.println("Wrong input!! Please enter integer --> ");
                input.nextLine();
            }
        } while (!isInputsTrue);

        System.out.println("Sum of " + number1 + " + " + number2 + " is " + (number1 + number2));
    }
}
