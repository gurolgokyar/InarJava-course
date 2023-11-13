package week_07_singleDimensionalArrays.assignment;

import java.util.Scanner;

public class Question_07_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");
        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        double[] reverse = reverse(numbers);
        for (double v: reverse){
            System.out.print(v + " ");
        }
    }
    public static double[] reverse(double[] array){
        double[] reverse = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            reverse[reverse.length- (i + 1)] = array[i];
        }
        return reverse;
    }
}
