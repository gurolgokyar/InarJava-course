package week_02_elementaryPrograming;

import java.util.Scanner;
public class Question_02_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount :");
        double amount = input.nextDouble();

        System.out.println("Enter annual interest rate in percentage:");
        double annualInterestRate = input.nextDouble();

        System.out.println("Enter number of years:");
        int years = input.nextInt();

        //Find the investment value
        double investmentValue = amount * Math.pow(1 + annualInterestRate / 1200.0 , years * 12) ;

        System.out.println("Accumulated value is $" + (int)(investmentValue * 100) / 100.0);




    }
}
