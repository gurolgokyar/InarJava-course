package week_11_inheritanceAndPolymorphism.assignments.exercise_11_15;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_15 {
    public static void main(String[] args) {
        double[][] points = getPoints();
        ArrayList<MyPoints> triangles = new ArrayList<>();

        double[] landmark = points[0];
        for (int i = 1; i < points.length - 1; i++) {
            triangles.add(new MyPoints(landmark, points[i], points[i + 1]));
        }

        double area = 0;
        for (int i = 0; i < triangles.size(); i++) {
            area += triangles.get(i).getArea();
        }

        System.out.printf("The total area is %1.3f\n", area);

    }

    public static double[][] getPoints() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of points: ");
        double[][] points = new double[input.nextInt()][2];

        System.out.println("Enter the coordinates of the points: ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        return points;
    }
}
