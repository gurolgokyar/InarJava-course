package week_08.assignments;

import java.util.Scanner;

public class Question_08_24 {
    public static void main(String[] args) {
        int[][] solvedSudoku = getInputs();
        boolean isValid = isValid(solvedSudoku);
        System.out.println((isValid ? "Valid solution" : "Invalid solution"));
    }

    public static int[][] getInputs(){
        Scanner input = new Scanner(System.in);
        int[][] solution = new int[9][9];

        System.out.println("Enter a sudoku puzzle solution: ");
        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < solution[0].length; j++) {
                solution[i][j] = input.nextInt();
            }
        }
        return solution;
    }

    public static boolean isValid(int[][] matrix){
        return isRow(matrix) || isColumn(matrix) || isBox(matrix);
    }

    public static boolean isRow(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int occuranceOfNumber = 0;
                for (int k = 0; k < matrix[0].length; k++) {
                    if (matrix[i][j] == matrix[i][k]){
                        occuranceOfNumber++;
                    }
                }
                if (occuranceOfNumber == 2){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isColumn(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int occuranceOfNumber = 0;
                for (int k = 0; k < matrix[0].length; k++) {
                    if (matrix[j][i] == matrix[k][i]){
                        occuranceOfNumber++;
                    }
                }
                if (occuranceOfNumber == 2){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isBox(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++) {
               if (!isSingleInBox(matrix,i,j)){
                   return false;
               }
            }
        }
        return true;
    }

    public static boolean isSingleInBox(int[][] matrix, int row, int column){
        int counter = 0;
        for (int i = (row / 3) * 3; i < row + 3; i++) {
            for (int j = (column / 3) * 3; j < column + 3; j++) {
                if (matrix[i][j] == matrix[row][column]){
                    counter++;
                }
            }
        }
        return counter < 2;
    }
}
