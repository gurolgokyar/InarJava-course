package week_07.assignment;

import java.util.Scanner;

public class Question_07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfDistinct = 0;
        System.out.print("Enter the numbers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            int number = input.nextInt();
            if (!isContains(numbers, number,numberOfDistinct)) {
                numbers[numberOfDistinct] = number;
                numberOfDistinct++;
            }
        }
        System.out.print("The number of distinct numbers is " + numberOfDistinct + "\nThe distinct numbers " + (numberOfDistinct > 1 ? "are " : "is "));
        for (int i = 0; i < numberOfDistinct; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static boolean isContains(int[] array, int number,int numberOfDistinct) {
        boolean isContains = false;
        for (int i = 0; i < numberOfDistinct; i++) { // If user inputs 0 you must use numberOfDistinct
            if (array[i] == number) {
                return true;
            }
        }
        return isContains;
    }
}
