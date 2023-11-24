package week_04_mathFunctions_StringsAndCharacters.assignments;

import java.util.Scanner;

public class Question_04_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount in dollars and cents: ");
        String money = input.nextLine();

        int indexOfDot = money.indexOf(',');
        String dollars = money.substring(0, indexOfDot);
        String cents = money.substring(indexOfDot + 1);

        int remaining=Integer.parseInt(cents);
        int quarters=remaining/25;
         remaining%=25;

        int dimes=remaining/10;
        remaining%=10;

        int nickel=remaining/5;
        int pennies=remaining%5;

        System.out.printf("Dollars: %s\n" +
                "Quarters: %d\n" +
                "Dimes: %d\n" +
                "Nickels: %d\n" +
                "Pennies: %d\n",dollars, quarters,dimes,nickel,pennies);

    }
}
