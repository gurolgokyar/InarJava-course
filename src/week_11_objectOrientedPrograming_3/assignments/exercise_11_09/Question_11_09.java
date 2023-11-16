package week_11_objectOrientedPrograming_3.assignments.exercise_11_09;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size n: ");
        int n = input.nextInt();
        int[][] matrix = fillTheMatrix(n);
        ArrayList<Integer> row = getRow(matrix);
        ArrayList<Integer> column = getColumn(matrix);

        displayMatrix(matrix);
        System.out.println("The largest row index: " + row);
        System.out.println("The largest column index: " + column);
    }
    public static int[][] fillTheMatrix(int n){
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = (int)(2 * Math.random());
            }
        }
        return result;
    }

    public static ArrayList<Integer> getRow(int[][] matrix){
        ArrayList<Integer> list = new ArrayList<>();
        int maxRepetition = 0;
        int counter;
        for (int i = 0; i < matrix.length; i++) {
            counter = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1){
                    counter++;
                }
            }
            if (counter > maxRepetition){
                maxRepetition = counter;
                list.clear();
                list.add(i);
            } else if (counter == maxRepetition) {
                list.add(i);
            }
        }
        return list;
    }

    public static ArrayList<Integer> getColumn(int[][] matrix){
        ArrayList<Integer> list = new ArrayList<>();
        int maxRepetition = 0;
        int counter;
        for (int i = 0; i < matrix[0].length; i++) {
            counter = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1){
                    counter++;
                }
            }
            if (counter > maxRepetition){
                maxRepetition = counter;
                list.clear();
                list.add(i);
            } else if (counter == maxRepetition) {
                list.add(i);
            }
        }
        return list;
    }

    public static void displayMatrix(int[][] matrix){
        System.out.println("The random array is:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
