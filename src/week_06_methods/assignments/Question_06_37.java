package week_06_methods.assignments;

import java.util.Scanner;

public class Question_06_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number and its width: ");
        int number = input.nextInt();
        int length = input.nextInt();

        System.out.println(number + " formatted to with " + length + ": " + format(number, length));
    }
    public static String format(int number, int length){
        String answer = number + "";
        for (int i =answer.length(); i < length ; i++) {
            answer = 0 + answer;
        }
        return answer;
    }
}
