package week_08.assignments;

import java.util.Scanner;
import java.util.function.ToDoubleBiFunction;

public class Question_08_33 {
    public static void main(String[] args) {
        double[][] points = getPoints();
       // double[] areas = getAreas(points);
    }

    public static double[][] getPoints() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");

        double[][] points = new double[4][2];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        return points;
    }

  public static double[] getAreas(double[][] points){
//        double[] intersectingPoints = getIntersectingPoint(points);
//        double area1 = getArea(intersectingPoints,points[0],points[1]);
//        double area2 = getArea(intersectingPoints,points[0],points[3]);
//        double area3 = getArea(intersectingPoints,points[1],points[2]);
//        double area4 = getArea(intersectingPoints,points[2],points[3]);
      return new double[]{2};
    }

    public static double[] getIntersectingPoint(double[][] points){
        double a = points[0][1]-points[0][0];
        double b = points[0][0]-points[1][0];
        double c = points[2][1]-points[3][1];
        double d = points[2][0]-points[3][0];
        double e = (points[0][1]-points[1][1]) * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
        double f = (points[2][1]-points[3][1]) * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];

        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));

        return new double[]{x,y};
    }

    public static double[] getArea(double[] point1,double[] point2, double[] point3){
 return new double[]{};
    }
}
