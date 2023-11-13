package week_05_loops.assignments;

import java.util.Scanner;

public class Question_05_37 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a decimal integer: ");
        int answer=input.nextInt();

        System.out.print("The binary value of the decimal " + "\"" + answer +"\" is: ");

        String binary="";
        while(answer>0){
            int binaryDigit=answer%2;
            answer/=2;

            binary= binaryDigit + binary;
        }

        System.out.println(binary);
    }
}
