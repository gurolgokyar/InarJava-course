package Week_02;

import java.util.Scanner;

public class Question_02_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter balance and annual interest rate(e.g. 3 for 3%) :");
        double balance = input.nextDouble();
        double annualInterestRate = input.nextDouble();

        //Find the interest for the next month
        double interest = annualInterestRate / 1200.0 *balance;

        System.out.println("The interest is " + (int)(interest * 100000) / 100000.0);


    }
}
