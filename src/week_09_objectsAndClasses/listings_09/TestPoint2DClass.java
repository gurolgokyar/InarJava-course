package week_09_objectsAndClasses.listings_09;

import java.awt.geom.Point2D;
import java.util.Scanner;

public class TestPoint2DClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter point1's x and y coordinates:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        Point2D p1 = new Point2D.Double(x1,y1);

        System.out.print("Enter point2's x and y coordinates:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        Point2D p2 = new Point2D.Double(x2,y2);

        System.out.println("The distance between p1 and p2 is " + p1.distance(p2));
        System.out.println(p1.toString());
        System.out.println(p1.distance(x2, y2));

        System.out.println(p2.getX() + " " + p2.getY());

    }
}
