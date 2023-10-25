package week_08.assignments;

import java.util.Scanner;

public class Question_08_26 {
    public static void main(String[] args) {
        double[][] matrix = getMatrix();
        double[][] rowSortedMatrix = sortRow(matrix);
        displayMatrix(rowSortedMatrix);
    }

    public static double[][] getMatrix(){
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][3];

        System.out.println("Enter a 3-by-3 matrix row by row: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }

    public static double[][] sortRow(double[][] matrix){
        double[][] sortedArray = new double[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++){
            double[] row = matrix[i];
            sortedArray[i] = sortARow(row);
        }
        return sortedArray;
    }

    public static double[] sortARow(double[] row) {
        for (int i = 0; i < row.length - 1; i++) {
            double min = row[i];
            int index = i;
            for (int j = i + 1; j < row.length; j++) {
                if (row[j] < min){
                    min = row[j];
                    index = j;
                }
            }
            if(index != i){
                row[index] = row[i];
                row[i] = min;
            }
        }
        return row;
    }

    public static void displayMatrix(double[][] matrix){
        System.out.println("\nThe row-sorted array is:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
