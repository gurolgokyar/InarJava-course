package week_07.assignment;

import java.util.Scanner;

public class Question_07_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int[] numbers = new int[input.nextInt()];

        System.out.print("Enter the values: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("The list has " + (isConsecutiveFour(numbers) ? "" : "no ") + "consecutive fours");
    }

    public static boolean isConsecutiveFour(int[] array){
        for (int i = 0; i < array.length; i++) {
            int numberOfElement = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]){
                    numberOfElement++;
                    if (numberOfElement == 4){
                        return true;
                    }
                }else {
                    numberOfElement = 1;
                }
            }
        }
        return false;
    }
}
