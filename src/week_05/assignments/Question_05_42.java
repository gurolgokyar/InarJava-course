package week_05.assignments;

import java.util.Scanner;

public class Question_05_42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the commission sought: ");
        double goalCommission = input.nextDouble();

         double commission=0;
         double sale;
        for (sale =0.01; commission < goalCommission; sale+=0.01) {
            commission = 0;
            commission += (sale <= 5000 ? sale * 0.08 : 5000 * 0.08);

            if (sale > 5000) {
                commission += (sale <= 10000 ? (sale - 5000) * 0.01 : 5000 * 0.1);
            }
            if (sale > 10000) {
                commission += (sale - 10000) * 0.12;
            }
        }

        System.out.printf("Minimum sales to earn $%1.2f : $%1.2f",goalCommission,sale );
    }
}
