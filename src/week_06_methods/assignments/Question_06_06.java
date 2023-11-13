package week_06_methods.assignments;

import java.util.Scanner;

public class Question_06_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        displayPattern(rows);
    }

    public static void displayPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }
            for (int j = i; j > 0; j--) {
                System.out.printf("%3d", j);
            }
            System.out.println();
        }
    }
}
