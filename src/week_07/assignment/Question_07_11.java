package week_07.assignment;

import java.util.Scanner;

public class Question_07_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter te numbers: ");
        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        double deviation = deviation(numbers);
        double mean = mean(numbers);

        System.out.printf("The mean is %1.2f\n", mean);
        System.out.printf("The standard deviation is %1.5f\n", deviation);
    }
    public static double deviation(double[] array){
        double sum = 0;
        for (double v : array) {
            sum += Math.pow(v - mean(array), 2);
        }
        return Math.pow(sum / (array.length - 1) , 0.5);

    }
    public static double mean(double[] array){
        double sum = 0;
        for (double v : array) {
            sum += v;
        }
        return sum / array.length;
    }
}
