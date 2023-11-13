package week_07_singleDimensionalArrays.assignment;

import java.util.Scanner;

public class Question_07_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter scores: (negative number signifies end): ");
        int[] scores = new int[101];  //For scores from 0 to 100
        while(true){
            int score = input.nextInt();
            if(score < 0){
                break;
            }
            if (score > 100){
                System.out.print("Invalid input!");
                continue;
            }
            scores[score]++;

        }
        double average = getAverage(scores);
        int[] statistic = statistic(scores,average);

        //Display the result
        System.out.println("Average of scores: " +average);
        System.out.println("Number of scores above or equal to average: " + statistic[1]);
        System.out.println("Number of scores below average: " + statistic[0]);
    }

    public static double getAverage(int[] scores) {
        //firstly find how many score are entered
        int numberOfScores = 0;
        int sumOfScores = 0;
        for (int i = 0; i <= 100; i++) {
            numberOfScores += scores[i];
            sumOfScores += scores[i] * i;
        }
        return (sumOfScores * 1.0) / numberOfScores;
    }
    public static int[] statistic(int[] scores, double average){
        int[] result = new int[2];
        for (int i = 0; i <= 100; i++) {
            if (scores[i] != 0){
                if (i < average){
                    result[0] += scores[i];
                }else {
                    result[1] += scores[i];
                }
            }
        }
        return result;
    }
}
