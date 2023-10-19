package week_08.assignments;

import java.util.Scanner;

public class Question_08_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size for the matrix: ");
        int size = input.nextInt();
        int[][] matrix = new int[size][size];
        matrix = fillTheMatrix(matrix);
        findRowsColumnDiagonalWithJust1s(matrix);
    }

    public static int[][] fillTheMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
        return matrix;
    }

    public static void findRowsColumnDiagonalWithJust1s(int[][] matrix) {
        displayMatrix(matrix);
        displayRowsWith1s(matrix);
//        displayColumnWith1s(matrix);
//        displayMajorDiagonalStatu(matrix);
//        displaySub_DiagonalStatu(matrix);
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " " );
            }
            System.out.println();
        }
    }

    public static void displayRowsWith1s(int[][] matrix){
        int[] array = new int[matrix.length];
        int counter = 0;

        for (int i = 0; i < matrix.length; i++){
            boolean isSame = true;
            for(int j = 1; j < matrix[0].length; j++){
                if (matrix[i][j-1] != matrix[i][j]){
                    isSame = false;
                    break;
                }
            }
            if (isSame){
                array[counter] = matrix[i][0] + 1;
                counter++;
            }
        }
        //Display the result
        if (counter == 0){
            System.out.println("No same numbers on a row");
            return;
        }

    }
}
