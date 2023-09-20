package week_06.assignments;

import java.util.Scanner;

public class Question_06_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("The amount invested: ");
        double amount = input.nextDouble();

        System.out.print("Annual interest rate: ");
        double annualInterestRate=input.nextDouble();

        displayInterest(amount,annualInterestRate);
    }

    public static void displayInterest(double amount, double interestRate){
        for (int i = 1; i<= 30; i++){
            System.out.printf("%d-> %1.2f\n",i,futureInvestmentValue(amount,interestRate,i));
        }
    }

    public static double futureInvestmentValue(double amount, double interestRate,int year){
        return amount * Math.pow(1 + interestRate/1200, year * 12);
    }
}
