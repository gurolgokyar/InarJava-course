package week_09.Questions_09.exercise_09_12;

import java.util.Scanner;

public class Question_09_12 {
    public static void main(String[] args) {
        double[]points = getPoints();
        IntersectingPoint intersectingPoint = new IntersectingPoint(points);
        System.out.println(intersectingPoint.toString());
    }
    public static double[] getPoints(){
        Scanner input = new Scanner(System.in);
        double[] result = new double[8];
        for (int i = 0; i < result.length; i++) {
            result[i] = input.nextDouble();
        }
        return result;
    }
}
