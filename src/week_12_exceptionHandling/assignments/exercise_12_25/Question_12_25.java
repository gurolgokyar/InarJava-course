package week_12_exceptionHandling.assignments.exercise_12_25;

import java.io.File;
import java.util.Scanner;

public class Question_12_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter directory name: ");
        File directory = new File("src/week_12_exceptionHandling/assignments/exercise_12_25/" + input.nextLine());
        boolean isCreated = directory.mkdir();
        System.out.println((isCreated ? "Directory created successfully" : "Directory already exists"));
    }
}
