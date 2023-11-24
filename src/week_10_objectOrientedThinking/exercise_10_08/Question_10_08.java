package week_10_objectOrientedThinking.exercise_10_08;

public class Question_10_08 {
    public static void main(String[] args) {
        System.out.printf("%24s%s\n", " ", "2009 Taxes");
        System.out.printf("%6s     %-8s     %-8s     %-8s     %-8s\n", "Income", "Status 1", "Status 2", "Status 3",
                "Status 4");
        System.out.println("-----------------------------------------------------------");

        double[][] brackets = {
                {8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 20885, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}
        };
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0, 33, 0.35};

        Tax tax = new Tax(0, brackets, rates, 1000);

        for (int i = 50_000; i <= 60_000; i += 1_000) {
            tax.setTaxableIncome(i);
            System.out.printf("%-6d     ", i);

            for (int j = 0; j < 4; j++) {
                tax.setFillingStatus(j);
                System.out.printf("%-8.2f     ", tax.getTax());
            }
            System.out.println();

        }

    }
}
