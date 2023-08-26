package week_03.assignments;

import java.util.Scanner;

public class Question_03_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point's x- and y- coordinates:");
        double x2 = input.nextDouble();
        double y2= input.nextDouble();

        //The point must be left side of the line goes from (0,100) to (200,0)
        double x0 = 0;
        double y0 = 100;
        double x1 = 200;
        double y1 = 0;
        double situation = (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0);

        if (situation >0 && (x1 > x2 && x2 > x0) && (y0 > y2 && y2 > y1)) {
            System.out.println("The point is in the triangle");
        } else {
            System.out.println("The point is not in the triangle");
        }
    }


}
