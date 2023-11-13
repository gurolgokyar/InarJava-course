package week_08_twoDimensionalArrays.assignments;

import java.util.Scanner;

public class Question_08_15 {
    public static void main(String[] args) {
        double[][] points = getPoints();
        boolean isSameLine = sameLine(points);
        System.out.println("The five points are " + (isSameLine ? "" : "not ") + "on the same line");
    }

    public static double[][] getPoints(){
        double[][] points = new double[5][2];

        Scanner input = new Scanner(System.in);
        System.out.print("Enter five points: ");

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        return points;
    }

    public static boolean sameLine(double[][] points){
        for (int i = 2; i < points.length; i++) {
                double status =
                        (points[1][0] - points[0][0]) * (points[i][1] - points[0][1]) -  (points[i][0] - points[0][0]) * (points[1][1] - points[0][1]);
            if (status != 0) {
                return false;
            }
        }
        return true;
    }
}
