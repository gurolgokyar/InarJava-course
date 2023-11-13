package week_08_twoDimensionalArrays.assignments;

import java.util.Scanner;

public class Question_08_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("(0-single filer, 1-married jointly or qualifying widow(er), 2-married separately, 3-head of" +
                " household) Enter the filing status: ");
        int status = input.nextInt();
        if (status > 3 || status < 0) {
            System.out.println("Invalid input!");
            System.exit(1);
        }

        System.out.println("Enter the taxable income: ");
        double income = input.nextDouble();

        double[][] brackets = {
                {8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 20885, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}
        };
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0, 33, 0.35};

        double tax = calculateTheTax(income, status, brackets, rates);
        System.out.println("Tax is $" + tax);
    }

    public static double calculateTheTax(double income, int status, double[][] brackets, double[] rates) {
        double tax = 0;
        tax += (income > brackets[status][0] ? brackets[status][0] * rates[0] : income * rates[0]);

        if (income > brackets[status][0]){
            tax += ((income > brackets[status][1] ? brackets[status][1] : income ) - brackets[status][0]) * rates[1];
        }
        if (income > brackets[status][1]){
            tax += ((income > brackets[status][2] ? brackets[status][2] : income) - brackets[status][1])* rates[2];
        }
        if (income > brackets[status][2]){
            tax += ((income > brackets[status][3] ? brackets[status][3] : income) - brackets[status][2]) * rates[3];
        }
        if (income > brackets[status][3]){
            tax += ((income > brackets[status][4] ? brackets[status][4] : income) - brackets[status][3]) * rates[4];
        }
        if (income > brackets[status][4]){
            tax += (income - brackets[status][4]) * rates[5];
        }
        return tax;
    }
}
