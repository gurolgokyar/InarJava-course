package week_08_multiDimensionalArrays.assignments;

import java.util.Scanner;

public class Question_08_32 {
    public static void main(String[] args) {
        double[][] points = getInputs();
        double area = getArea(points);

        if (area == 0) {
            System.out.println("The three points are on the same line!");
        } else {
            System.out.printf("The are of the triangle is %1.2f", area);
        }
    }

    public static double[][] getInputs() {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[3][2];

        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        return points;
    }

    public static double getArea(double[][] points) {
        double side1 = getSide(points[0], points[1]);
        double side2 = getSide(points[0], points[2]);
        double side3 = getSide(points[1], points[2]);
        double s = (side1 + side2 + side3) / 2;

        //(x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0)
        if ((points[1][0] - points[0][0])*(points[2][1] - points[0][1]) - (points[2][0] - points[0][0]) * (points[1][1] - points[0][1]) == 0){
            return 0;
        }
        return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
    }

    public static double getSide(double[] point1, double[] point2) {
        return Math.pow(Math.pow(point1[0] - point2[0], 2) + Math.pow(point1[1] - point2[1], 2), 0.5);
    }
}
