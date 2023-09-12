package week_05.assignments;

import java.util.Scanner;

public class Question_05_02 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        final int NUMBER_OF_QUESTIONS=10;
        int correctAnswer=0;
        String output="";
        long startTime=System.currentTimeMillis();

        for (int i=0;i<NUMBER_OF_QUESTIONS;i++){
            int number1=(int)(Math.random()*15 +1);
            int number2=(int)(Math.random()*15 +1);

            System.out.print("What is " +number1 + "+" +number2 +"? ");
            int answer= input.nextInt();

            if (answer==number1+number2){
                System.out.println("You are correct!\n");
                correctAnswer++;
            }else {
                System.out.println("Your answer is wrong.\n" +
                        number1 + "+" +number2 +" should be " +(number1+number2) +"\n");
            }
            output+=number1 + "+" +number2 +"=" + answer +((number1+number2==answer)?" correct\n":"wrong\n");
        }

        long finishTime=System.currentTimeMillis();
        long testTime=(finishTime-startTime)/1000;

        //Display the results
        System.out.println("Correct count is " + correctAnswer);
        System.out.println("Test time is " + testTime +" seconds\n");
        System.out.println(output);
    }
}
