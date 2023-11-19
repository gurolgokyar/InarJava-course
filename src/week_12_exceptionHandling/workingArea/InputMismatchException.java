package week_12_exceptionHandling.workingArea;

import java.util.Scanner;

public class InputMismatchException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");

        boolean continualInput = true;
        do {
            try {
                int number = input.nextInt();
                continualInput = false;
            } catch (java.util.InputMismatchException ex) {
                System.out.println("Try again. (Incorrect input: an integer is required)");
                input.nextLine();
            }
        } while (continualInput);
    }
}
