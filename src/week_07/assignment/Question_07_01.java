package week_07.assignment;

import java.util.Scanner;

public class Question_07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of student: ");
        double[] scores = new double[input.nextInt()];

        System.out.print("Enter " + scores.length + " scores: ");

        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextDouble();
        }

        //Display the grades base on best score
        printGrade(scores);

    }

    public static void printGrade(double[] scores) {
        //Firstly find the best score
        double bestScore = getBestScore(scores);
        displayGrade(scores,bestScore);
    }
   public static double getBestScore(double[] scores) {
        double result = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > result){
                result = scores[i];
            }
        }
        return result;
    }
    public static void displayGrade(double[] scores, double bestScore) {
        for (int i = 0; i < scores.length; i++){
            char grade;
            if(scores[i] >= bestScore - 10){
               grade = 'A';
            } else if (scores[i] >= bestScore - 20) {
                grade = 'B';
            } else if (scores[i] >= bestScore - 30) {
                grade = 'C';
            }else if (scores[i] >= bestScore - 40){
                grade = 'D';
            }else {
                grade = 'F';
            }
            System.out.println("Student " + i + ": score is " + scores[i] + " and grade is " + grade);
        }
    }
}
