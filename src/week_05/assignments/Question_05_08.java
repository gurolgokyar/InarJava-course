package week_05.assignments;

import java.util.Scanner;

public class Question_05_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of student: ");
        int numberOfStudent= input.nextInt();

        System.out.println("Enter each student's name and score");
        System.out.println("Student: 1");

        input.nextLine();
        System.out.print("Name: ");
        String name=input.nextLine();

        System.out.print("Score: ");
        double score = input.nextDouble();

        for (int i=2;i<=numberOfStudent;i++){
            System.out.println("Student: "+i);

            input.nextLine();
            System.out.print("Name: ");
            String nameOfNextStudent=input.nextLine();

            System.out.print("Score: ");
            double scoreOfNextStudent=input.nextDouble();

            if (scoreOfNextStudent > score) {
                score=scoreOfNextStudent;
                name=nameOfNextStudent;
            }
        }
        System.out.println("Student with the highest score: " +name);
    }
}
