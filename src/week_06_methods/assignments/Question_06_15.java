package week_06_methods.assignments;

public class Question_06_15 {
    public static void main(String[] args) {
        System.out.printf("%-13s%-13s%-13s\t\t%-13s%-13s\n","Taxable","Single","Married Joint","Married","Head of");
        System.out.printf("%-13s%-13s%-13s\t\t%-13s%-13s\n","Income","","or Qualifying","Separate","a House");
        System.out.printf("%-13s%-13s%-13s\t\t%-13s%-13s\n","","","Widow(er)","","");

        for (int i = 0; i < 65; i++) {
            System.out.print("-");
        }
        System.out.println();

        for (int income = 50_000; income <= 60_000; income += 50){
            System.out.printf("%-13d%-13d%-13d\t\t%-13d%-13d\n",income,single(income),
                    marriedJoint(income),marriedSeparate(income),head(income));

        }
    }

    public static int single(int income){
        double tax = 0;
        tax += getTax(0, 8350, income, 0.10);

        if (income > 8350){
            tax += getTax(8350, 33950, income, 0.15);
        }
        if (income > 33950){
            tax += getTax(33950, 82250, income, 0.25);
        }
        if (income > 82250){
            tax += getTax(82250, 171550, income, 0.28);
        }
        if (income > 171550){
            tax += getTax(171550, 372950, income, 0.33);
        }
        if (income > 372950){
            tax += getTax(372950, income, income, 0.35);
        }
        return (int)Math.round(tax);
    }

    public static int marriedJoint(int income){
        double tax = 0;
        tax += getTax(0, 16700, income, 0.10);

        if (income > 16700){
            tax += getTax(16700, 67900, income, 0.15);
        }
        if (income > 67900){
            tax += getTax(67900, 13750, income, 0.25);
        }
        if (income > 137050){
            tax += getTax(137050, 208850, income, 0.28);
        }
        if (income > 208850){
            tax += getTax(208850, 372950, income, 0.33);
        }
        if (income > 372950){
            tax += getTax(372950, income, income, 0.35);
        }
        return (int)Math.round(tax);
    }

    public static int marriedSeparate(int income){
        double tax = 0;
        tax += getTax(0, 8350, income, 0.10);

        if (income > 8350){
            tax += getTax(8350, 33950, income, 0.15);
        }
        if (income > 33950){
            tax += getTax(33950, 68525, income, 0.25);
        }
        if (income > 68525){
            tax += getTax(68525, 104425, income, 0.28);
        }
        if (income > 104425){
            tax += getTax(104425, 186475, income, 0.33);
        }
        if (income > 186475){
            tax += getTax(186475, income, income, 0.35);
        }
        return (int)Math.round(tax);
    }

    public static int head(int income){
        double tax = 0;
        tax += getTax(0, 11950, income, 0.10);

        if (income > 11950){
            tax += getTax(11950, 45500, income, 0.15);
        }
        if (income > 45500){
            tax += getTax(45500, 117450, income, 0.25);
        }
        if (income > 117450){
            tax += getTax(117450, 190200, income, 0.28);
        }
        if (income > 190200){
            tax += getTax(190200, 372950, income, 0.33);
        }
        if (income > 372950){
            tax += getTax(372950, income, income, 0.35);
        }
        return (int)Math.round(tax);
    }

    public static double getTax(double startingPart, double endingPart, double income, double taxRate) {
        return income < endingPart ? (income - startingPart) * taxRate : (endingPart - startingPart) * taxRate;
    }

}

