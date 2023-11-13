package week_07_singleDimensionalArrays.assignment;

import java.util.Scanner;

public class Question_07_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        System.out.print("Enter ten numbers to exclude from (1 - 54): ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        int randomNumber = getRandom(numbers);

        System.out.println("Number generated: " + randomNumber);
    }

    public static int getRandom(int... numbers) {
        int randomNumber;
        while (true) {
            randomNumber = (int) (Math.random() * 53 + 1);
            boolean isContains = false;
            for (int v : numbers) {
                if (v == randomNumber) {
                    isContains = true;
                    break;
                }
            }
            if (!isContains) {
                break;
            }
        }
        return randomNumber;
    }
}
