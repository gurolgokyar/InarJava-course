package week_05.assignments;

import java.util.Scanner;

public class Question_05_42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the commission sought: ");
        double goalCommission = input.nextDouble();

         double commission=0;
         int sale;
        for (sale = 1; commission < goalCommission; sale++) {
            commission = 0;
            commission += (sale <= 5000 ? sale * 0.08 : 5000 * 0.08);

            if (sale > 5000) {
                commission += (sale <= 10000 ? (sale - 5000) * 0.01 : 5000 * 0.1);
            }
            if (sale > 10000) {
                commission += (sale - 10000) * 0.12;
            }
        }

        System.out.println("Minimum sales to earn $" + goalCommission + ": $" + (sale-1));
    }
}
