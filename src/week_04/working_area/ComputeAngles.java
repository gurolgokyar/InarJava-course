package week_04.working_area;

import java.util.Scanner;

public class ComputeAngles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        //find the length of three sides
        double side1 = Math.sqrt(Math.pow(x1-x2 ,2) + Math.pow(y1-y2 ,2));
        double side2 = Math.sqrt(Math.pow(x1-x3 ,2) + Math.pow(y1-y3 ,2));
        double side3 = Math.sqrt(Math.pow(x3-x2 ,2) + Math.pow(y3-y2 ,2));

        double angle1 = Math.acos((side1*side1-side2*side2-side3*side3)/(-2*side2*side3));
        double angle2 = Math.acos((side2*side2-side1*side1-side3*side3)/(-2*side1*side3));
        double angle3 = Math.acos((side3*side3-side2*side2-side1*side1)/(-2*side2*side1));

        double angle1InDegree = Math.toDegrees(angle1);
        double angle2InDegree = Math.toDegrees(angle2);
        double angle3InDegree = Math.toDegrees(angle3);

        //Display the results
        System.out.printf("The three angles are\n %5.2f\n %5.2f\n %5.2f\n",angle1InDegree,angle2InDegree,
                angle3InDegree );
    }
}
