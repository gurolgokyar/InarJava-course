package week_05.assignments;

import java.util.Scanner;

public class Question_05_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers (it ends with input of 0): ");
        int answer = input.nextInt();
        if (answer==0){
            System.out.println("First input can't be 0!");
            System.exit(1);
        }
        int max = answer;
        int count = 1;

        while (answer != 0) {
            answer = input.nextInt();
            if (answer == max) {
                count++;
            } else if (answer > max && answer != 0) {
                max = answer;
                count = 1;
            }
        }

        System.out.println("The largest count " +max + " and the occurrence of the count is " + count);
    }

}
