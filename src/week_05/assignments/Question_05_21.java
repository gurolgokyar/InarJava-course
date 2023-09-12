package week_05.assignments;

import java.util.Scanner;

public class Question_05_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Number of years: ");
        int numberOfYears = input.nextInt();

        System.out.printf("%-13s\t\t%-13s\t\t%-13s\n", "Interest Rate", "Monthly Payment", "Total Payment");

        for (double annualInterestRate = 5.000; annualInterestRate <= 8.000; annualInterestRate += 0.125) {
            double monthlyPayment = (loanAmount * (annualInterestRate / 1200)) / (1 - 1 / (Math.pow(1 + annualInterestRate / 1200,
                    numberOfYears * 12)));
            double totalPayment = monthlyPayment * numberOfYears * 12;

            System.out.printf("%-5.3f%-8s\t\t%-13.2f\t\t%-13.2f\n", annualInterestRate, "%", monthlyPayment, totalPayment);
        }
    }

}
