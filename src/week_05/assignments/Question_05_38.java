package week_05.assignments;

import java.util.Scanner;

public class Question_05_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal integer: ");
        int answer= input.nextInt();

        System.out.print("The octal of " +answer + " is ");

        String toOctal="";
        while(answer>0){
            int octalDigit=answer%8;
            answer/=8;

            toOctal=octalDigit+toOctal;
        }

        System.out.println(toOctal);
    }

}
