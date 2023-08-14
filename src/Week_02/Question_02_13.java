package Week_02;

import java.util.Scanner;

public class Question_02_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the monthly saving amount :");
        double amount = input.nextDouble();

        //Find amount after the first month
        amount = amount * (1 + 0.05 / 12);
        amount = (amount + 100) * (1 + 0.05 / 12);
        amount = (amount + 100) * (1 + 0.05 / 12);
        amount = (amount + 100) * (1 + 0.05 / 12);
        amount = (amount + 100) * (1 + 0.05 / 12);
        amount = (amount + 100) * (1 + 0.05 / 12);

        System.out.println("After the sixth month, the account value " + "is $" + (int) (amount * 100) / 100.0);

    }
}
