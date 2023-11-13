package week_08_twoDimensionalArrays.assignments;

import java.util.Scanner;

public class Question_08_23 {
    public static void main(String[] args) {
        int[][] matrix = getInputs();
        int[] flippedCoordinates = getFlippedCoordinates(matrix);
        System.out.printf("The flipped cell is at (%d, %d)\n", flippedCoordinates[0],flippedCoordinates[1]);
    }

    public static int[][] getInputs(){
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[6][6];

        System.out.print("Enter a 6-by-6 matrix row by row: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    public static int[] getFlippedCoordinates(int[][] matrix){
        int[] coordinates = new int[2];
        for (int i = 0; i < matrix.length; i++) {
            int numberOf1s = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1){
                    numberOf1s++;
                }
            }
            if (numberOf1s % 2 != 0){
                coordinates[0] = i;
                break;
            }
        }

        for (int i = 0; i < matrix[0].length; i++) {
            int numberOf1s = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1){
                    numberOf1s++;
                }
            }
            if (numberOf1s % 2 != 0){
                coordinates[1] = i;
                break;
            }
        }
        return coordinates;
    }
}
