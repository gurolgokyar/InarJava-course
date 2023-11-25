package week_12_exceptionHandling.assignments.exercise_12_24;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Question_12_24 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/week_12_exceptionHandling/assignments/exercise_12_23/Salary.txt");
        Scanner input = new Scanner(file);

        double[] sumOfSalaries = new double[3];
        int[] numberOfStatus = new int[3];
        while (input.hasNext()) {
            String line = input.nextLine();
            line = line.replaceAll(",", ".");//For casting from string to double value at line 28
            double salary = getSalary(line);
            int rank = getRank(line);
            sumOfSalaries[rank] += salary;
            numberOfStatus[rank]++;
        }

        displayTheResult(sumOfSalaries, numberOfStatus);
    }

    public static double getSalary(String line) {
        String[] information = line.split(" ");
        return Double.parseDouble(information[3]);
    }

    public static int getRank(String line) {
        String[] information = line.split(" ");
        return switch (information[2]) {
            case "assistant" -> 0;
            case "associate" -> 1;
            case "full" -> 2;
            default -> -1;
        };
    }

    public static void displayTheResult(double[] sumOfSalaries, int[] numberOfStatus) {
        System.out.printf("Total salary for assistant professors : %1.2f\n", sumOfSalaries[0]);
        System.out.printf("Total salary for associate professors : %1.2f\n", sumOfSalaries[1]);
        System.out.printf("Total salary for full professors : %1.2f\n", sumOfSalaries[2]);
        System.out.printf("Total salary for all faculty : %1.2f\n",
                (sumOfSalaries[0] + sumOfSalaries[1] + sumOfSalaries[2]));
        System.out.println("-------------------------------------------------------------\n");

        System.out.printf("Average salary for assistant professors : %1.2f\n", (sumOfSalaries[0] / numberOfStatus[0]));
        System.out.printf("Average salary for associate professors : %1.2f\n", (sumOfSalaries[1] / numberOfStatus[1]));
        System.out.printf("Average salary for full professors : %1.2f\n", (sumOfSalaries[2] / numberOfStatus[2]));
        System.out.printf("Average salary for all faculty : %1.2f\n",
                ((sumOfSalaries[0] + sumOfSalaries[1] + sumOfSalaries[2]) / (numberOfStatus[0] + numberOfStatus[1] + numberOfStatus[2])));
    }
}
