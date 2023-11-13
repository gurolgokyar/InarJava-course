package week_05_loops.assignments;

public class Question_05_05 {
    public static void main(String[] args) {
        final double POUNDS_PER_KILOGRAM=2.2;
        System.out.printf("%-10s %10s %s %-10s %10s\n", "Kilograms", "Pounds", "   |   ", "Pounds", "Kilograms");

        for (int k = 1, p = 20; k < 200; k += 2, p += 5) {
            double pound = k * POUNDS_PER_KILOGRAM;
            double kilogram = p / POUNDS_PER_KILOGRAM;

            //Display the results side by side
            System.out.printf("%-10d %10.1f %s %-10d %10.2f\n", k, pound, "   |   ", p, kilogram);
        }
    }
}
