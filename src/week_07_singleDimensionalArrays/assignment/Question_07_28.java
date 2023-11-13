package week_07_singleDimensionalArrays.assignment;

import java.util.Scanner;

public class Question_07_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten numbers: ");
        int[] list = new int[10];

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        //Display the combinations
        displayCombinations(list);
    }

    public static void displayCombinations(int[] list){
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                System.out.println(list[i] + ", " + list[j]);
            }
        }
    }
}
