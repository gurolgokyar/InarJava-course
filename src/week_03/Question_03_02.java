package week_03;

import java.util.Scanner;

public class Question_03_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int number3 = (int)(Math.random() * 10);

       System.out.println("what is " + number1 + "+" + number2 + "+" + number3 + "=" + "?");
       int answer = input.nextInt();

        System.out.println((answer==number1 + number2 + number3 ) ? number1 + " + " + number2 + " + " + number3 + " = " + answer +" is true" :  number1 + " + " + number2 + " + " + number3 + " = " + answer + " is false" );
    }
}
