package week_07_singleDimensionalArrays.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        double[] sortedArray = bubbleSort(numbers);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static double[] bubbleSort(double[] array) {
        boolean isFormatted = true;
        while (isFormatted) {
            isFormatted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isFormatted = true;
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }
}
