package week_09_objectOrientedPrograming_1.assignments.exercise_09_10;

import java.util.Scanner;

public class Question_09_10 {
    public static void main(String[] args) {
      double[] coefficient = getCoefficient();
      QuadraticEquation quadraticEquation = new QuadraticEquation(coefficient[0],coefficient[1],coefficient[2]);
        System.out.println(quadraticEquation.toString());
    }
    public static double[] getCoefficient(){
        Scanner input = new Scanner(System.in);
        double[] result = new double[3];
        System.out.print("Enter a, b, c: ");
        for (int i = 0; i < result.length; i++) {
            result[i] = input.nextDouble();
        }
        return result;
    }
}
