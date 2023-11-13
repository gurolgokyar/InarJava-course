package week_08_twoDimensionalArrays.assignments;

import java.util.Scanner;

public class Question_08_31 {
    public static void main(String[] args) {
        double[][] points = getInputs();
        if (getIntersectingPoints(points) == null){
            System.out.println("The two lines are parallel.");
        }else {
            System.out.printf("The intersecting point is at (%f, %f)\n",getIntersectingPoints(points)[0],
                    getIntersectingPoints(points)[1]);
        }
    }

    public static double[][] getInputs(){
        Scanner input = new Scanner(System.in);

        double[][] points = new double[4][2];
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        return points;
    }

    public static double[] getIntersectingPoints(double[][] points){
        double a = points[0][1] - points[1][1];
        double b = points[0][0] - points[1][0];
        double c = points[2][1] - points[3][1];
        double d = points[2][0] - points[3][0];
        double e = a*points[0][0] - b*points[0][1];
        double f = c*points[2][0] - d*points[2][1];

        if(a*d - b*c== 0){
            return null;
        }
        double x = (e*d - b*f) / (a*d - b*c);
        double y = (a*f - e*c) / (a*d - b*c);
        return new double[]{x, y};
    }
}
