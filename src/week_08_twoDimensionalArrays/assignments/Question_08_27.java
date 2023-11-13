package week_08_twoDimensionalArrays.assignments;

import java.util.Scanner;

public class Question_08_27 {
    public static void main(String[] args) {
        double[][] matrix = getMatrix();
        double[][] columnSortedMatrix = sortColumn(matrix);
        displayMatrix(columnSortedMatrix);

    }

    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][3];
        System.out.println("Enter 3-by-3 matrix row by row:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }

    public static double[][] sortColumn(double[][] matrix) {
        double[][] sortedMatrix = new double[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix[0].length; i++) {
            double[] column = new double[matrix[0].length];
            for (int j = 0; j < matrix.length; j++) {
                column[j] = matrix[j][i];
            }
            sortColumn(column);
            for (int j = 0; j < matrix.length; j++) {
                sortedMatrix[j][i] = column[j];
            }
        }
        return sortedMatrix;
    }

    public static void sortColumn(double[] column) {
        for (int i = 0; i < column.length; i++) {
            double min = column[i];
            int index = i;
            for (int j = i + 1; j < column.length; j++) {
                if (column[j] < min) {
                    min = column[j];
                    index = j;
                }
            }
            if (index != i) {
                column[index] = column[i];
                column[i] = min;
            }
        }
    }

    public static void displayMatrix(double[][] matrix){
        System.out.println("\nThe column-sorted array is");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
