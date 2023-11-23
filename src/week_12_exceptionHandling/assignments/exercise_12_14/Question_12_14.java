package week_12_exceptionHandling.assignments.exercise_12_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question_12_14 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.print("Enter the file path name: ");
        File file = new File(new Scanner(System.in).next());

        Scanner input = new Scanner(file);
        double sum = 0;
        int numberOfIntegers = 0;

        while(input.hasNext()){
            sum += Integer.parseInt( input.next());
            numberOfIntegers++;
        }
        System.out.println("Sum of integers in the file : " + sum);
        System.out.println("Number of the integers : " + numberOfIntegers);
        System.out.println("Average : " + (sum / numberOfIntegers));
    }
}
