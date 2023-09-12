package week_03;

import java.util.Scanner;

public class Question_03_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount (e. g 11,56) :");
        double amount = input.nextDouble();

        //Find the money units
        int dollar = (int) amount;

        //To find the other units send the fractional part to a new variable
        int fractionalPart = (int) (amount * 100 % 100);

        //find the money units except dollar
        int quarter = fractionalPart / 25;
        int remainingAmount = fractionalPart % 25;

        int dime = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int nickel = remainingAmount / 5;
        int penny = remainingAmount % 5;

        //Display the results
        System.out.println("Your amount " + amount + "consist of");
        System.out.println(dollar + ((dollar > 1) ? " dollars" : " dollar"));
        System.out.println(quarter + ((quarter > 1) ? " quarters" : " quarter"));
        System.out.println(dime + ((dime > 1) ? " dimes" : " dime"));
        System.out.println(nickel + " nickel");
        System.out.println(penny + ((penny > 1) ? " pennies" : "penny"));


    }
}
