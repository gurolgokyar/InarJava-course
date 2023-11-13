package week_03_selections;

import java.util.Scanner;

public class Question_03_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4 :");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        //Find the variables of leaner equation
        double a = y1 - y2;
        double b = x2 - x1;
        double c = y3 - y4;
        double d = x4 - x3;
        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;

        //Now find the coordinate of intersecting point
        double intersectingX = (int)(((e * d - b * f) / (a * d - b * c))*10000)/10000.0;
        double intersectingY = (int)(((a * f - e * c) / (a * d - b * c))*10000)/10000.0;

        if (a * d - b * c == 0) {
            System.out.println("The two lines are parallel");
        }
        else{
            System.out.println("The intersecting point is at (" + intersectingX + "," + intersectingY + ") ");
        }
    }


}
