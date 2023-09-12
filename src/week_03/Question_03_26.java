package week_03;

import java.util.Scanner;

public class Question_03_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer :");
        int answer = input.nextInt();

        System.out.println("Is " + answer +" divisible by 5 and 6? "+ (answer%5==0 && answer%6==0));
        System.out.println("Is " + answer +" divisible by 5 or 6? "+ (answer%5==0 || answer%6==0));
        System.out.println("Is " + answer +" divisible by 5 or 6, but not both? "+ (answer%5==0 ^ answer%6==0));

    }
}
