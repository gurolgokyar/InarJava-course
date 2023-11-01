package week_09.Questions_09.exercise_09_12;

import week_09.Questions_09.exercise_09_11.LinerEquation;

import java.util.Scanner;

public class Question_09_12 {
    public static void main(String[] args) {
        double[]points = getPoints();
        IntersectingPoint intersectingPoint = new IntersectingPoint(points);
        LinerEquation linerEquation = new LinerEquation(intersectingPoint.getCoefficient());
        System.out.println(linerEquation.toString());
    }
    public static double[] getPoints(){
        Scanner input = new Scanner(System.in);
        double[] result = new double[8];
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        for (int i = 0; i < result.length; i++) {
            result[i] = input.nextDouble();
        }
        return result;
    }
}
