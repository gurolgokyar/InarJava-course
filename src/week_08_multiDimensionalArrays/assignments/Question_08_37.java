package week_08_multiDimensionalArrays.assignments;

import java.util.Scanner;

public class Question_08_37 {
    public static void main(String[] args) {
        String[][] states = {
                {"Alabama","Montgomery"},
                {"Alaska","Juneau"},
                {"Arizona","Phoenix"}};
        int numberOfCorrectAnswer = findTheNumberOfCorrectAnswers(states);
        System.out.println("The correct count is " + numberOfCorrectAnswer);
    }

    public static int findTheNumberOfCorrectAnswers(String[][] states){
        Scanner input = new Scanner(System.in);
        int counter = 0;
        for (int i = 0; i < states.length; i++) {
            System.out.print("What is the capital of the " + states[i][0] + " ? ");
            String answer = input.nextLine();

            answer = answer.toLowerCase();
            states[i][1] = states[i][1].toLowerCase();

            if (answer.equals(states[i][1])){
                counter++;
            }
        }
        return counter;
    }
}
