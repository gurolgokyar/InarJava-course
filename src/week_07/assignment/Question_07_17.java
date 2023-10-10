package week_07.assignment;

import java.util.Scanner;

public class Question_07_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of student: ");
        int numberOfStudent = input.nextInt();

        String[] names = new String[numberOfStudent];
        double[] scores = new double[numberOfStudent];

        System.out.println("Enter the name and score for each student: ");
        for (int i = 0; i < numberOfStudent; i++) {
            System.out.print("Student " + (i +1) + ":");
            input.nextLine();
            names[i] = input.nextLine();

            System.out.print("Score:");
            scores[i] = input.nextDouble();
        }
        for (int i = 0; i < numberOfStudent - 1; i++) {
            double maxScore = scores[i];
            int indexOfMaxScore = i;
            for (int j = i +1; j < numberOfStudent; j++) {
                if (scores[j] > maxScore){
                    maxScore = scores[j];
                    indexOfMaxScore = j;
                }
            }
            if (indexOfMaxScore != i){
                scores[indexOfMaxScore] = scores[i];
                scores[i] = maxScore;

                String temp = names[indexOfMaxScore];
                names[indexOfMaxScore] = names[i];
                names[i]= temp;
            }
        }
        for (String v: names
             ) {
            System.out.println(v);
        }

    }
}
