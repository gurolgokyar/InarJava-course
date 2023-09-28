package week_06.working_area;

public class FindTax {


    /**
     * Main Method
     */
    public static void main(String[] args) {
        int status = 2;
        double income = 20_000;

        double tax = getTax(status, income);
        System.out.println(tax);
    }

    public static double getTax(int status, double income) {
        double tax = 0;
        if (status == 2) {
            tax += findTax(0, 8350, income, 0.10);
            if (income > 8350) {
                tax += findTax(8350, 33950, income, 0.15);
            }
            if (income > 33950) {
                tax += findTax(33950, 68525, income, 0.25);
            }
            if (income > 68525) {
                tax += findTax(68525, 14425, income, 0.28);
            }
            if (income > 104425) {
                tax += findTax(104425, 186475, income, 0.33);
            }
            if (income > 186475) {
                tax += findTax(186475, income, income, 0.35);
            }
        }
        return tax;
    }
    public static double findTax(double startingIncome,double endingIncome,double income,double taxRat){
        return income < endingIncome ? (income - startingIncome) * taxRat : (endingIncome - startingIncome) * taxRat;
    }

}