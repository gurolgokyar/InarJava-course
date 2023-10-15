package week_08.assignments;

import java.util.Scanner;

public class Question_08_05 {
    public static void main(String[] args) {
        double[][] matrix1 = new double[3][3];
        System.out.print("Enter matrix1: ");
        getMatrix(matrix1);

        System.out.print("Enter matrix2: ");
        double[][] matrix2 = new double[3][3];
        getMatrix(matrix2);

        //Add two matrix and display
        addAndDisplayMatrix(matrix1,matrix2);
    }
    public static void getMatrix(double[][] matrix){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
    }

    public static void addAndDisplayMatrix(double[][] matrix1, double[][] matrix2){
        double[][] addedMatrix = addMatrix(matrix1, matrix2);
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            if (i == 1){
                System.out.print(" +  ");
            }else {
                System.out.print("    ");
            }

            for (int j = 0; j < matrix2[0].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            if (i == 1){
                System.out.print(" =  ");
            }else {
                System.out.print("    ");
            }
            for (int j = 0; j < addedMatrix[0].length; j++) {
                System.out.print(addedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static double[][] addMatrix(double[][] matrix1 , double[][] matrix2){
        double[][] addedMatrix = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < addedMatrix.length; i++) {
            for (int j = 0; j < addedMatrix[0].length; j++) {
                addedMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return addedMatrix;
    }
}
