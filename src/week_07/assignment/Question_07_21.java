package week_07.assignment;

import java.util.Scanner;

public class Question_07_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of balls to drop: ");
        int numberOfBall = input.nextInt();

        System.out.print("Enter the number of slots in the bean machine: ");
        int[] slots = new int[input.nextInt()];

        int[] ballsInSlots = getBallInSlots(slots, numberOfBall);

        // Display the histogram
        for (int i = numberOfBall; i > 0; i--) {
            for (int j = 0; j < slots.length; j++){
                if (ballsInSlots[j] < i){
                    System.out.print(" ");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static int[] getBallInSlots(int[] slots, int numberOfBall) {
        for (int i = 0; i < numberOfBall; i++) {
            int numberOfRightPath = 0;
            for (int j = 0; j < slots.length - 1; j++) {
                int path = (int) (Math.random() * 2);
                if (path == 0) {
                    numberOfRightPath++;
                    System.out.print("R");
                } else {
                    System.out.print("L");
                }
            }
            slots[numberOfRightPath]++;
            System.out.println();
        }
        return slots;
    }
}
