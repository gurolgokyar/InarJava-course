package week_04.assignments;

import java.util.Scanner;

public class Question_04_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of bounding circle: ");
        double radius = input.nextDouble();

        double angle = Math.toRadians(72);
        double angleOfPoint1=Math.PI/2 - angle;
        double angleOfPoint2=Math.PI/2;
        double angleOfPoint3=Math.PI/2 + angle;
        double angleOfPoint4=Math.PI/2 + 2*angle;
        double angleOfPoint5=Math.PI/2 + 3*angle;

        double point1x = radius*Math.cos(angleOfPoint1);
        double point1Y = radius*Math.sin(angleOfPoint1);
        double point2x = radius*Math.cos(angleOfPoint2);
        double point2Y = radius*Math.sin(angleOfPoint2);
        double point3x = radius*Math.cos(angleOfPoint3);
        double point3Y = radius*Math.sin(angleOfPoint3);
        double point4x = radius*Math.cos(angleOfPoint4);
        double point4Y = radius*Math.sin(angleOfPoint4);
        double point5x = radius*Math.cos(angleOfPoint5);
        double point5Y = radius*Math.sin(angleOfPoint5);

        //Display the coordinates of points
        System.out.printf("(%f, %f)\n",point1x,point1Y);
        System.out.printf("(%f, %f)\n",point2x,point2Y);
        System.out.printf("(%f, %f)\n",point3x,point3Y);
        System.out.printf("(%f, %f)\n",point4x,point4Y);
        System.out.printf("(%f, %f)\n",point5x,point5Y);
    }

}
