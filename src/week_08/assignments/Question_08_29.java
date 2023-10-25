package week_08.assignments;

import java.util.Scanner;

public class Question_08_29 {

    public static void main(String[] args) {
        System.out.print("Enter list1: ");
        int[][] list1 = getArray();

        System.out.print("Enter list2: ");
        int[][] list2 = getArray();

        System.out.println("The two arrays are " + (equals(list1, list2) && equals(list2, list1) ? "" : "not ") +
                "strictly " +
                "identical");
    }

    public static int[][] getArray(){
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    public static boolean equals(int[][] list1, int[][] list2){
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list1[0].length; j++) {
                if (!isContainsList2(list2, list1[i][j])){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isContainsList2(int[][] list2, int number){
        for (int i = 0; i < list2.length; i++) {
            for (int j = 0; j < list2[0].length; j++) {
                if (list2[i][j] == number){
                    return true;
                }
            }
        }
        return false;
    }
}
