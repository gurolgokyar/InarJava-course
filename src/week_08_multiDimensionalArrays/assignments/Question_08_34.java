package week_08_multiDimensionalArrays.assignments;

import java.util.Scanner;

public class Question_08_34 {
    public static void main(String[] args) {
        double[][] points = getInputs();
        double[] rightMostLowestPoint = getRightmostLowestPoint(points);
        displayPoint(rightMostLowestPoint);
    }

    public static double[][] getInputs(){
        double[][] points = new double[6][2];

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 6 points -> ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        return points;
    }

    public static double[] getRightmostLowestPoint(double[][] points){
        //Firstly find the lowest point
        double lowestPoint = points[0][1];
        int index = 0;
        for (int i = 1; i < points.length; i++) {
            if (points[i][1] < lowestPoint){
                lowestPoint = points[i][1];
                index = i;
            }
        }

        //Find right most point
        for (int i = 0; i < points.length; i++) {
            if (points[i][1] == lowestPoint && points[i][0] > points[index][0]){
                index = i;
            }
        }
        return points[index];
    }

    public static void displayPoint(double[] point){
        System.out.printf("The rightmost lowest point is (%1.1f, %1.1f)\n",point[0],point[1]);
    }
}
