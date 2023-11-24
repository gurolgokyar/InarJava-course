package week_04_mathFunctions_StringsAndCharacters.assignments;

import java.util.Scanner;

public class Question_04_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String employeeName=input.nextLine();

        System.out.print("Enter number of hours worked in a week: ");
        double numberOfHours = input.nextDouble();

        System.out.print("Enter hourly pay rate:");
        double hourlyPay=input.nextDouble();

        System.out.print("Enter federal tax withholding rate:");
        double federalTax= input.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double stateTax= input.nextDouble();

        //Find the payroll statement
        double grossPay= numberOfHours*hourlyPay;

        double federalTaxAmount=grossPay*federalTax;

        double stateTaxAmount=grossPay*stateTax;

        double totalTax=federalTaxAmount+stateTaxAmount;

        double netPay=grossPay-totalTax;

        //Display the results
        System.out.printf("Employee's name: %s\n" +
                "Hours Worked: %2.1f\n" +
                "Pay Rate: $%3.2f\n" +
                "Gross Pay: $%3.2f\n" +
                "Deductions:\n" +
                "\tFederal Withholding ("+federalTax*100 +"%s): $%3.2f\n" +
                "\tState Withholding ("+stateTax*100+"%s): $%3.2f\n" +
                "\tTotal Deduction: $%3.2f\n" +
                "Net Pay: $%3.2f",
                employeeName,numberOfHours,hourlyPay,grossPay,"%",federalTaxAmount,"%",stateTaxAmount,totalTax,netPay);
    }
}
