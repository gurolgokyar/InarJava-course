package week_03_selections;

import java.util.Scanner;

public class Question_03_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Generate the two random integer
        int number1 = (int)(Math.random()*100) ;
        int number2 = (int)(Math.random()*100) ;

        System.out.print("What is " + number1 + "+" + number2 + " = ?" );
        int answer = input.nextInt();

        //Display the results
        System.out.println((answer == (number1 + number2) ? "You are correct" : "You are wrong ! " + number1 + " + " + number2 + " should be " + (number1+number2)));
    }
}
