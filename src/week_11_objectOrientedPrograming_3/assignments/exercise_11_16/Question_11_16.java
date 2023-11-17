package week_11_objectOrientedPrograming_3.assignments.exercise_11_16;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Question_11_16 {
    public static void main(String[] args) {
        Random random = new Random();
        int number1 = random.nextInt(100);
        int number2 = random.nextInt(100);
        String result = (number1 + number2) + "";

        AbstractList<String> answers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("What is " + number1 + " + " + number2 + " ?");
            String answer = input.next();
            if (answer.equals(result)){
                System.out.println("You got it!");
                break;
            } else if (answers.contains(answer)) {
                System.out.println("You already entered " + answer);
                System.out.print("Wrong answer. Try again. ");
            }else {
                System.out.print("Wrong answer. Try again. ");
            }
            answers.add(answer);

        }
    }
}
