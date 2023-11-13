package week_03_selections;


import java.util.Scanner;

public class Question_03_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB:");
        double rate = input.nextDouble();
        if(rate<=0){
            System.out.println("Incorrect input");
            System.exit(1);
        }

        System.out.print("Enter 0 to convert dollars to RMB and  1 vice versa:");
        int moneyType = input.nextInt();

        if(moneyType!=0 && moneyType!=1){
            System.out.println("Incorrect input");
            System.exit(2);
        }

        if (moneyType == 0) {
            System.out.print("Enter the dollar amount :");
            double amount = input.nextDouble();
            double exchangeAmount = (int) (rate * amount * 100) / 100.0;
            System.out.println("$" + amount + " is " + exchangeAmount);
        } else {
            System.out.print("Enter the RMB amount :");
            double amount = input.nextDouble();
            double exchangeAmount = (int) (amount / rate * 100) / 100.0;
            System.out.println(amount + "yuan is $" + exchangeAmount);
        }
    }
}
