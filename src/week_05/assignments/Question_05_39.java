package week_05.assignments;

public class Question_05_39 {
    public static void main(String[] args) {
        double saleAmount = 0;
        double payment = 0;

        while (payment <= 30000) {
            payment = 5000;
            saleAmount += 0.01;

            payment+=(saleAmount<=5000?saleAmount*0.08:5000*0.08);

            if (saleAmount>5000){
                payment+=(saleAmount<=10000?(saleAmount-5000)*0.1:5000*0.1);
            }
            if (saleAmount>10000){
                payment+=(saleAmount-10000)*0.12;
            }

        }

        System.out.printf("Minimum sales to earn $30,000: $%3.2f\n", saleAmount);
    }


}
