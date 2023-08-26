package week_03.assignments;

import java.util.Scanner;

public class Question_03_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int flip = (int) (Math.random() * 3);

        System.out.print("Guess the flip of coin (0 represents head and 1 represents tail: ");
        int guess = input.nextInt();

        if (flip == guess)
            System.out.println("Your guess is correct ");
        else
            System.out.println("Your guess is incorrect ");

    }
}
