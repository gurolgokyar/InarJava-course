package week_08.assignments;

import java.util.Scanner;

public class Question_08_19 {
    public static void main(String[] args) {
        int[][] matrix = getMatrix();
        System.out.println("Matrix has " + ((isConsecutiveFour(matrix)) ? "": "not ") + "consecutive four numbers");
    }
    public static int[][] getMatrix(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter row number: ");
        int row = input.nextInt();

        System.out.print("Enter the column number: ");
        int column = input.nextInt();

        int[][] matrix = new int[row][column];
        System.out.println("Fill the matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    public static boolean isConsecutiveFour(int[][] matrix){
        return (isConsecutiveFourAtRow(matrix) || isConsecutiveFourAtColumn(matrix) || isConsecutiveFourAtDiagonal(matrix));
    }

    public static boolean isConsecutiveFourAtRow(int[][] matrix) {
        int count;
        for (int i = 0; i < matrix.length; i++) {
            count = 1;
            for (int j = 0; j < matrix[0].length - 1; j++){
                if (matrix[i][j] == matrix[i][j + 1]){
                    count++;
                    if (count == 4){
                        return true;
                    }
                }else {
                    count = 1;
                }
            }
        }
        return false;
    }

    public static boolean isConsecutiveFourAtColumn(int[][] matrix) {
        int count;
        for (int i = 0; i < matrix[0].length; i++) {
            count = 1;
            for (int j = 0; j < matrix.length - 1; j++) {
                if (matrix[j][i] == matrix[j + 1][i]){
                    count++;
                    if (count == 4){
                        return true;
                    }
                }else {
                    count = 1;
                }
            }
        }
        return false;
    }

    public static boolean isConsecutiveFourAtDiagonal(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (isLeftDiagonal(i,j,matrix) || isRightDiagonal(i,j,matrix) ){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isRightDiagonal(int row , int column, int[][] matrix){
        if (row >= matrix.length - 3){
            return false;
        }
        if (column>= matrix[0].length){
            return false;
        }
        int count;
        int number = matrix[row][column];
        for (int i = 1; i < 4; i++) {
            if (number != matrix[row + i][column + i]){  // Notice hear !
                return false;
            }
        }
        return true;
    }

    public static boolean isLeftDiagonal(int row, int column, int[][] matrix){
        if (row >= matrix.length- 3){
            return false;
        }
        if (column < 3){  // Notice hear!
            return false;
        }

        int number = matrix[row][column];
        for (int i = 1; i< 4; i++){
            if(number != matrix[row+ i][column - i]){  //Notice hear!
                return false;
            }
        }
        return true;
    }
}

