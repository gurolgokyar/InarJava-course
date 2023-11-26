package week_12_exceptionHandling.assignments.exercise_12_31;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Question_12_31 {
    public static void main(String[] args) throws IOException {
        System.out.println(
                "----------------------------------------------------------------------------------------" +
                        "------------------------------------------------------------------------");
        System.out.printf("%4s\t%4s %d     \t\t%4s %d     \t\t%4s %d     \t\t%4s %d     \t\t%4s %d     \t\t%4s " +
                        "%d     \t\t%4s %d     \t\t%4s %d     \t\t%4s %d     \t\t%4s %d\n",
                "Year", "Rank", 1, "Rank", 2, "Rank", 3, "Rank", 4, "Rank", 5, "Rank", 1, "Rank", 2, "Rank", 3, "Rank", 4, "Rank", 5);
        System.out.println(
                "-------------------------------------------------------------------------------------------" +
                        "-----------------------------------------------------------------------");

        for (int i = 2001; i <= 2010; i++) {
            File file =
                    new File("src/week_12_exceptionHandling/assignments/exercise_12_30/babyNames/babynameranking" + i + ".txt");
            Scanner input = new Scanner(file);
            String[] names = getNames(file, input);

            System.out.printf("%4d\t", i);
            for (int j = 0; j < 5; j++) {
                System.out.printf("%-11s\t\t", names[j]);
            }
            for (int j = 5; j < 10; j++) {
                System.out.printf("%-11s\t\t", names[j]);
            }
            System.out.println();
        }
    }

    public static String[] getNames(File file, Scanner input) {
        String[] names = new String[10];
        for (int i = 0, j = 5; i < 5; i++, j++) {
            String[] line = input.nextLine().split("[ \t]");
            names[i] = line[3];
            names[j] = line[1];
        }
        return names;
    }
}
