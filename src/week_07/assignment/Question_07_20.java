package week_07.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");
        double[] list = new double[10];

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextDouble();
        }

        double[] sortedList = selectionSort2(list);
        System.out.println(Arrays.toString(sortedList));
    }

    public static double[] selectionSort2(double[] list) {
        for (int i = list.length -1; i > 0; i--) {
            double maxNumber = list[i];
            int indexOfMaxNumber = i;
            for (int j = i - 1; j >= 0; j--) {
                if (list[j] > maxNumber){
                    maxNumber = list[j];
                    indexOfMaxNumber = j;
                }
            }
            if (indexOfMaxNumber != i){
                list[indexOfMaxNumber] = list[i];
                list[i] = maxNumber;
            }
        }
        return list;
    }
}
