package week_08.assignments;

import java.util.Scanner;

public class Question_08_08 {
    public static void main(String[] args) {
        double[][] points = getPoints();
        double nearestDistance = getNearestDistance(points);
        displayTheNearestPoints(points,nearestDistance);
    }

    public static double[][] getPoints() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        double[][] points = new double[input.nextInt()][2];

        System.out.print("Enter " + points.length + " points: ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < 2; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        return points;
    }

    public static double getNearestDistance(double[][] points) {
        double nearestDistance = findDistance(points[0], points[1]);

        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = findDistance(points[i],points[j]);

                if (distance < nearestDistance){
                    nearestDistance = distance;
                }
            }
        }
        return nearestDistance;
    }

    public static double findDistance(double[] point1, double[] point2) {
        return Math.sqrt(Math.pow(point1[0] - point2[0], 2) + Math.pow(point1[1] - point2[1], 2));
    }

    public static void displayTheNearestPoints(double[][] points, double nearestDistance){
        for (int i = 0; i < points.length - 1; i++){
            for (int j = i + 1; j < points.length;j++){
                double distance = findDistance(points[i],points[j]);
                if (distance == nearestDistance){
                    System.out.printf("The closet two points are (%1.1f, %1.1f) and (%1.1f, %1.1f)\n",points[i][0],
                            points[i][1],
                            points[j][0],points[j][1]);
                }
            }
        }
        System.out.println("Their distance is " + nearestDistance);
    }
}

