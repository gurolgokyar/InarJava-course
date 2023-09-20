package week_05.assignments;

import java.util.Scanner;

public class Question_05_36 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the first 9 digits of ISBN as an integer: ");
        int first9= input.nextInt();

        System.out.print("The ISBN-10 number is 0" +first9);

        int sum=0;
        for (int i = 9; i >= 1; i--) {
            int digit=first9%10;
            first9/=10;

            sum+=digit*i;
        }

        //Find the digit10
        int digit10=sum%11;
        char digitInChar=(digit10<10?(char)('0' +digit10):'X');

        //Display the results
        System.out.println( digitInChar);

    }
}
