package week_07.assignment;

import java.util.Scanner;

public class Question_07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the numbers: ");
        int[] numbers = new int[10];

        int numberOfDistinct = 0;

        for (int i = 0; i < 10; i++) {
            int answer = input.nextInt();
//            if (answer == 0){
//                numberOfDistinct++;
//                continue;
//            }

            boolean isContain = false;
            for (int j = 0; j < 10; j++) {
                if (numbers[j] == answer){
                    isContain = true;
                    break;
                }
            }
            if (!isContain){
                numbers[numberOfDistinct] = answer;
                numberOfDistinct++;
            }
        }
        for (int i = 0; i < numberOfDistinct; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
