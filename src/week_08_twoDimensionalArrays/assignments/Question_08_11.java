package week_08_twoDimensionalArrays.assignments;

import java.util.Scanner;

public class Question_08_11 {
    public static void main(String[] args) {
        playGame();
    }
    public static void playGame(){
        Scanner input = new Scanner( System.in);
        System.out.print("Enter a number between 0 and 511:");
        int answer = input.nextInt();
        int[][] matrix = getCorrespondingMatrix(answer);
        displayTheMatrix(matrix);
    }
    public static int[][] getCorrespondingMatrix(int number){
        int[][] matrix = new int[3][3];
        int counter = 0;
        int lengthOfNumber = Integer.toBinaryString(number).length();

        for (int i = matrix.length - 1; i >= 0 ; i--) {
            for (int j = matrix[0].length - 1; j >= 0 ; j--) {
                if (counter < lengthOfNumber){
                    matrix[i][j] = Integer.toBinaryString(number).charAt(lengthOfNumber - 1 - counter) - 48;
                    counter++;
                }
            }
        }
        return matrix;
    }

    public static void displayTheMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print((matrix[i][j] == 0 ? "H" : "T") + " ");
            }
            System.out.println();
        }
    }
}
