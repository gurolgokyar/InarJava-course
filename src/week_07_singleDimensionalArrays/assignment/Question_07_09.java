package week_07_singleDimensionalArrays.assignment;

import java.util.Scanner;

public class Question_07_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");
        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        double min = min(numbers);
        System.out.println("The min number is " + min);
    }

    public static double min(double[] numbers){
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < result){
                result = numbers[i];
            }
        }
        return result;
    }
}
