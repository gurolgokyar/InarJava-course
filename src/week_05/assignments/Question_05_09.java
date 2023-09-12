package week_05.assignments;

import java.util.Scanner;

public class Question_05_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of student: ");
        int numberOfStudent = input.nextInt();

        String nameOfHighestScoringStudent = "";
        double scoreOfHighestScoringStudent = 0;

        String nameOfSecondHighestScoringStudent = "";
        double scoreOfSecondHighestScoringStudent = 0;
        System.out.println("Enter each student's name and score");


        for (int i = 1; i <= numberOfStudent; i++) {
            input.nextLine();
            System.out.println("Student: " + i);
            System.out.print("   Name: ");
            String nameOfNewStudent = input.nextLine();
            System.out.print("   Score: ");
            double scoreOfNewStudent = input.nextDouble();

            if (scoreOfNewStudent < 0 || scoreOfNewStudent > 100) {
                System.out.println("Invalid score!");
                i--;
            }

            if (scoreOfNewStudent > scoreOfHighestScoringStudent) {
                nameOfSecondHighestScoringStudent = nameOfHighestScoringStudent;
                scoreOfSecondHighestScoringStudent = scoreOfHighestScoringStudent;

                nameOfHighestScoringStudent = nameOfNewStudent;
                scoreOfHighestScoringStudent = scoreOfNewStudent;
            } else if (scoreOfNewStudent == scoreOfHighestScoringStudent) {
                nameOfHighestScoringStudent += ", " + nameOfNewStudent;

            } else if (scoreOfNewStudent < scoreOfHighestScoringStudent && scoreOfNewStudent >= scoreOfSecondHighestScoringStudent) {
                if (scoreOfNewStudent == scoreOfSecondHighestScoringStudent)
                    nameOfSecondHighestScoringStudent += ", " + nameOfNewStudent;
                else {
                    nameOfSecondHighestScoringStudent = nameOfNewStudent;
                    scoreOfSecondHighestScoringStudent = scoreOfNewStudent;
                }
            }
        }
        if (numberOfStudent == 0) {
            System.out.println("Enter the number of student again");
        } else if (numberOfStudent == 1) {
            System.out.println("The highest scoring student: (score is " +scoreOfHighestScoringStudent + ") " + nameOfHighestScoringStudent);
        } else {
            System.out.println("The highest scoring student:(score is " +scoreOfHighestScoringStudent + ") " + nameOfHighestScoringStudent);
            System.out.println("The second highest scoring student: (score is " + scoreOfSecondHighestScoringStudent + ") " + nameOfSecondHighestScoringStudent);
        }

    }

}
