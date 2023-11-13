package week_07_singleDimensionalArrays.assignment;

import java.util.Scanner;

public class Question_07_10 {
    public static int indexOfSmallestElement(double[] array){
        int index = 0;
        double smallestElement = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallestElement){
                smallestElement = array[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");

        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        int indexOfSmallestElement = indexOfSmallestElement(numbers);

        System.out.println("The minimum numbers is " + numbers[indexOfSmallestElement] + " and index -> " + indexOfSmallestElement);
    }
}
