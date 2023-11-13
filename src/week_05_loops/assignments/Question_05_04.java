package week_05_loops.assignments;

public class Question_05_04 {
    public static void main(String[] args) {

        final double KILOMETER_PER_MILE = 1.609;

        System.out.printf("%-10s %-10s\n", "Miles", "Kilometers");

        for (int i = 1; i <= 10; i++) {
            double kilometer = i * KILOMETER_PER_MILE;

            System.out.printf("%-10d %-10.3f\n", i, kilometer);
        }
    }
}
