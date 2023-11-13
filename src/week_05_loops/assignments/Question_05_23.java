package week_05_loops.assignments;

public class Question_05_23 {
    public static void main(String[] args) {

        double sumFromRight = 0;
        double sumFromLeft = 0;

        for (int i = 1, j = 50000; i <= 50000; i++, j--) {
            sumFromRight += 1.0 / j;
            sumFromLeft += 1.0 / i;
        }

        System.out.println("Summation of series left to right: " + sumFromLeft);
        System.out.println("Summation of series right to left: " + sumFromRight);
        System.out.println("Summation of series right to left - Summation of series left to right: " + (sumFromRight - sumFromLeft));

    }
}
