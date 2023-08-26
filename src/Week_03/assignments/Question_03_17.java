package Week_03.assignments;

import java.util.Scanner;

public class Question_03_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("scissor (0) , rock(1) , paper(2) : ");
        int answer = input.nextInt();

        //Generate random number
        int computer = (int)(Math.random()*3);

        //now compare the answer and computer
        String computer1;
        String answer1 = "";


        if(answer==0)
            answer1="scissor";
        else if(answer==1)
            answer1="rock";
        else if(answer==2)
            answer1 = "paper";
        else
            System.out.println("Invalid input!");
            System.exit(1);


        if(computer==0)
            computer1="scissor";
        else if(computer==1)
            computer1="rock";
        else
            computer1="paper";


        if((answer==0 && computer==0)||(answer==1 && computer==1)||(answer==2 && computer==2)) {
            System.out.println("The computer is " + computer1 + ". You are " + answer1 + " too. It is a draw.");
        }
        else if ((answer==0 && computer==2) || (answer==1 && computer==0) || (answer==2 &&computer==1)) {
            System.out.println("The computer is " + computer1 + ". You are " + answer1 + ". You won.");
        }
        else  {
            System.out.println("The computer is " + computer1 +". You are " + answer1 + ". The computer won.");
        }
    }
}
