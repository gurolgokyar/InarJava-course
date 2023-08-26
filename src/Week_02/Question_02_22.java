package week_02;

import java.util.Scanner;

public class Question_02_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount as integer, for example 1156, for 11.56 or 1100 for $11:");
        int amount = input.nextInt();

        //Find the monetary units
        int dollar = amount / 100;
        int remainingAmount = amount % 100;

        int quarter = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int dimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int nickel = remainingAmount / 5;
        int penny = remainingAmount % 5;

        //Display the results
        System.out.println("Your amount " + amount + " consist of\n" +
                dollar + " dollars\n" +
                quarter + " quarters\n" +
                dimes + " dimes\n" +
                nickel + " nickels\n" +
                penny + " pennies");


    }
}
