package week_05.assignments;

import java.util.Scanner;

public class Question_05_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines(between 1 and 15): ");
        int numberOfLines = input.nextInt();

        if (numberOfLines < 1 || numberOfLines > 15){
            System.out.println("Invalid input!");
            System.exit(1);
        }
            for (int i = 1; i <= numberOfLines; i++) {
                for (int j = numberOfLines; j > i; j--) {
                    System.out.print("   ");
                }
                for (int j = i; j > 0; j--) {
                    System.out.printf("%-2d ",j);
                }
                for (int j = 2; j <= i; j++) {
                    System.out.printf("%-2d ",j);
                }
                System.out.println();
            }
    }

}
