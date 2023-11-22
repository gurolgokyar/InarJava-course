package week_12_exceptionHandling.assignments.excercise_12_03;

import java.util.Random;
import java.util.Scanner;

public class Question_12_03 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the index of the array -> ");
        try {
            System.out.println("You chose: " + array[input.nextInt()]);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Out of Bound!!");
        }
    }
}
