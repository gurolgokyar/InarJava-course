package week_06.assignments;

public class Question_06_11 {
    public static void main(String[] args) {

        System.out.printf("%11s\t\t%s\n","SalesAmount","Commission");
        for (int i = 0; i<26; i++){
            System.out.print("-");
        }
        System.out.println();

        double commission;
        for (int i = 10000; i <= 100000; i+= 5000) {
            commission = findCommission(i);
            System.out.printf("  %-9d\t\t %8.1f\n",i,commission);
        }
    }

    public static double findCommission(int sale){
        double commission = 0;
        if (sale > 5000){
            commission += 5000 * 0.08;
        }else {
            commission += sale * 0.08;
        }
        if (sale > 10000){
            commission += 5000 * 0.10 + (sale - 10000) * 0.12;
        }else {
            commission += (sale - 5000) * 0.10;
        }
        return commission;
    }

}
