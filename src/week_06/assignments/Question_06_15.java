package week_06.assignments;

public class Question_06_15 {
    public static void main(String[] args) {
        System.out.printf("%-13s%-13s%-13s\t\t%-13s%-13s\n","Taxable","Single","Married Joint","Married","Head of");
        System.out.printf("%-13s%-13s%-13s\t\t%-13s%-13s\n","Income","","or Qualifying","Separate","a House");
        System.out.printf("%-13s%-13s%-13s\t\t%-13s%-13s\n","","","Widow(er)","","");

        for (int i = 0; i< 90; i++){
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
        tax += (income <= 8350) ? income * 0.10 : 8350 * 0.10;

        if (income > 8350){
            tax += (income <= 33950) ? (income - 8350) * 0.15 : (33950-8350) * 0.15;
        }
        if (income > 33950){
            tax += (income <= 82250) ? (income - 33950) * 0.25 : (82250 - 33950) * 0.25;
        }
        if (income > 82250){
            tax += (income <= 171550) ? (income - 82250) * 0.28 : (171550 - 82250) * 0.28;
        }
        if (income > 171550){
            tax += (income < 372950) ? (income - 171550) * 0.33 : (372950 - 171550) * 0.33;
        }
        if (income > 372950){
            tax += (income - 372950) * 0.35;
        }
        return (int)Math.round(tax);
    }

    public static int marriedJoint(int income){
        double tax = 0;
        tax += (income <= 16700) ? income * 0.10 : 16700 * 0.10;

        if (income > 16700){
            tax += (income <= 67900) ? (income - 16700) * 0.15 : (67900-16700) * 0.15;
        }
        if (income > 67900){
            tax += (income <= 137050) ? (income - 67900) * 0.25 : (137050 - 67900) * 0.25;
        }
        if (income > 137050){
            tax += (income <= 208850) ? (income - 137050) * 0.28 : (208850-137050) * 0.28;
        }
        if (income > 208850){
            tax += (income < 372950) ? (income - 208850) * 0.33 : (372950 - 208850) * 0.33;
        }
        if (income > 372950){
            tax += (income - 372950) * 0.35;
        }
        return (int)Math.round(tax);
    }

    public static int marriedSeparate(int income){
        double tax = 0;
        tax += (income <= 8350) ? income * 0.10 : 8350 * 0.10;

        if (income > 8350){
            tax += (income <= 33950) ? (income - 8350) * 0.15 : (33950 - 8350) * 0.15;
        }
        if (income > 33950){
            tax += (income <= 68525) ? (income - 33950) * 0.25 : (68525 - 33950) * 0.25;
        }
        if (income > 68525){
            tax += (income <= 104425) ? (income - 68525) * 0.28 : (104425-68525) * 0.28;
        }
        if (income > 104425){
            tax += (income < 186475) ? (income - 104425) * 0.33 : (186475 - 104425) * 0.33;
        }
        if (income > 186475){
            tax += (income - 186475) * 0.35;
        }
        return (int)Math.round(tax);
    }

    public static int head(int income){
        double tax = 0;
        tax += (income <= 11950) ? income * 0.10 : 11950 * 0.10;

        if (income > 11950){
            tax += (income <= 45500) ? (income - 11950) * 0.15 : (45500-11950) * 0.15;
        }
        if (income > 45500){
            tax += (income <= 117450) ? (income - 45500) * 0.25 : (117450 - 45500) * 0.25;
        }
        if (income > 117450){
            tax += (income <= 190200) ? (income - 117450) * 0.28 : (190200-117450) * 0.28;
        }
        if (income > 190200){
            tax += (income < 372950) ? (income - 190200) * 0.33 : (372950 - 190200) * 0.33;
        }
        if (income > 372950){
            tax += (income - 372950) * 0.35;
        }
        return (int)Math.round(tax);
    }

}

