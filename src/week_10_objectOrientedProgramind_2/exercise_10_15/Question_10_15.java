package week_10_objectOrientedProgramind_2.exercise_10_15;

import week_10_objectOrientedProgramind_2.exercise_10_13.MyRectangle2D;

import java.util.Scanner;

public class Question_10_15 {
    public static void main(String[] args) {
        double[][] points = getPoints();
        MyRectangle2D r = MyRectangle2D.getRectangle(points);
        System.out.printf("The bounding rectangle's center (%f, %f), width %f, height %f\n",r.getX(),r.getY(),
                r.getWidth(),r.getHeight());

    }
    public static double[][] getPoints(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five points: ");
        double[][] points = new double[5][2];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < 2; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        return points;
    }
}
