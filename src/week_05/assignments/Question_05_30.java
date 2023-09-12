package week_05.assignments;

import java.util.Scanner;

public class Question_05_30 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter an amount: ");
        double amount= input.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate= input.nextDouble();

        System.out.print("Enter the number of month: ");
        int numberOfMonth= input.nextInt();

        //Calculate the saving account
        final double MONTHLY_INTEREST=annualInterestRate/1200;
        double savingAccount=0;
        for (int i=1;i<=numberOfMonth;i++){
            savingAccount+=amount+(amount+savingAccount)*MONTHLY_INTEREST;
        }

        //Display the results
        System.out.printf("Amount in the savings account after " +numberOfMonth + (numberOfMonth>1?" months:":
                " month:")+" $%3.2f" , savingAccount);
    }
}
