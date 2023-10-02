package week_07.assignment;

import java.util.Scanner;

public class Question_07_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the ten integers: ");
        int[] numbers = new int[10];

        for (int i = 9; i >= 0; i--) {
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
