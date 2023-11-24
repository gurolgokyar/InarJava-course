package week_12_exceptionHandling.assignments.exercise_12_23;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Question_12_23 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/week_12_exceptionHandling/assignments/exercise_12_23/Salary.txt");

        try (
                PrintWriter output = new PrintWriter(file);
        ) {
            for (int i = 1; i <= 1_000; i++) {
                int rank = (int) (Math.random() * 3);
                String rangInString = getRank(rank);
                double salary = getSalary(rank);
                output.printf("%s%d %s%d %s %1.2f\n", "FirstName", i, "LastName", i, rangInString, salary);
                System.out.printf("%s%d %s%d %s %1.2f\n", "FirstName", i, "LastName", i, rangInString, salary);
            }
        }

    }

    public static String getRank(int rank) {
        return switch (rank) {
            case 0 -> "assistant";
            case 1 -> "associate";
            case 2 -> "full";
            default -> "";
        };
    }

    public static double getSalary(int rank) {
        double minSalary = switch (rank) {
            case 0 -> 50_000;
            case 1 -> 60_000;
            case 2 -> 75_000;
            default -> 0;
        };
        double salaryToAdd = switch (rank) {
            case 0 -> 30_000;
            case 1 -> 50_000;
            case 2 -> 55_000;
            default -> 0;
        };
        salaryToAdd *= Math.random();

        return minSalary + salaryToAdd;
    }
}
