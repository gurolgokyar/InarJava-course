package week_05_loops.assignments;

import java.util.Scanner;

public class Question_05_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loan = input.nextDouble();

        System.out.print("Number of Years: ");
        int year = input.nextInt();

        System.out.print("Annual Interest Rate: ");
        double annualInterest = input.nextDouble();

        double monthlyInterest = annualInterest / 1200;

        double monthlyPayment = (loan * monthlyInterest) / (1 - 1 / (Math.pow(1 + monthlyInterest, year * 12)));
        double totalPayment=monthlyPayment * year * 12;

        System.out.printf("Monthly Payment: %3.2f\n", monthlyPayment);
        System.out.printf("Total Payment: %3.2f\n", totalPayment);

        System.out.printf("%-9s\t%-9s\t%-9s\t%-9s\n", "Payment#", "Interest", "Principal", "Balance");
        for (int i = 1; i <= 12 * year; i++) {
            double interest = loan * monthlyInterest;
            double principal = monthlyPayment - interest;
            loan -= principal;  //Balance

            if (i == year * 12 && loan != 0) {
                principal += loan;
                loan = 0;
            }
            System.out.printf("%-9d\t%-9.2f\t%-9.2f\t%-9.2f\n", i, interest, principal, loan);
        }


    }

}
