package week_09.Questions_09.exercise_09_06;

import java.util.Random;

public class Question_09_06 {
    public static void main(String[] args) {
        long executionTime = getExecutionTime(100_000);
        System.out.println("The execution time of sorting 100.000 numbers using selection sort: " + executionTime +
                " milliseconds");
    }

    public static long getExecutionTime(int numbersToSort){
        Random random = new Random();
        int[] numbers = new int[numbersToSort];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(numbersToSort);
        }

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i < numbers.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[index]){
                    index = j;
                }
            }
            if (index != i){
                int temp = numbers[i];
                numbers[i] = numbers[index];
                numbers[index] = temp;
            }
        }
        stopWatch.stop();
        return stopWatch.getElapsedTime();
    }
}
