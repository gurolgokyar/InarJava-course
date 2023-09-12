package week_05.assignments;

import java.util.Scanner;

public class Question_05_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the initial deposit amount: ");
        double amount= input.nextDouble();

        System.out.print("Enter the annual percentage yield: ");
        double annualPercentageYield= input.nextDouble();
        final double MONTHLY_PERCENTAGE_YIELD=annualPercentageYield/1200;

        System.out.print("Enter maturity period (number of month): ");
        int numberOfMonth= input.nextInt();

        System.out.printf("%-5s\t%-10s\n","Month","CD Value");
        double cdValue=amount;
        for (int i=1;i<=numberOfMonth;i++){
            cdValue+=cdValue*MONTHLY_PERCENTAGE_YIELD;

            //Display the result
            System.out.printf("%-5d\t%-10.2f\n",i,cdValue);
        }
    }
}
