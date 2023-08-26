package week_03.assignments;

import java.util.Scanner;

public class Question_03_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter circle1'center x- , y- coordinates, and radius :");
        double circle1x = input.nextDouble();
        double circle1y = input.nextDouble();
        double circle1Radius = input.nextDouble();

        System.out.print("Enter circle2'center x- , y- coordinates, and radius :");
        double circle2x = input.nextDouble();
        double circle2y = input.nextDouble();
        double circle2Radius = input.nextDouble();

        //Compare the two circles
        //Find the distance between two centers
        double distance = Math.pow((Math.pow(circle1x - circle2x, 2) + Math.pow(circle1y - circle2y, 2)), 0.5);

        if (circle1Radius >= circle2Radius) {
            if (distance <= circle1Radius - circle2Radius) {
                System.out.println("Circle2 is inside circle1");
            } else if (distance > circle1Radius + circle2Radius) {
                System.out.println("Circle2 does not overlap circle1");
            }
            else {
                System.out.println("Circle2 overlaps circle1");
            }
        }
        //If circle2'radius longer than circle's radius
        else {
            if (distance <= circle2Radius - circle1Radius) {
                System.out.println("Circle1 is inside circle2");
            } else if (distance > circle1Radius + circle2Radius) {
                System.out.println("Circle1 does not overlap circle2");
            }
            else {
                System.out.println("Circle1 overlaps circle2");
            }
        }
    }
}
