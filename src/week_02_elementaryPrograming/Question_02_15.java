package week_02_elementaryPrograming;

import java.util.Scanner;

public class Question_02_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre x1 and y1 for first point :");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Enter x2 and y2 for second point :");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        //Compute the distance between points
        double distance = Math.pow(Math.pow(x1-x2 ,2 ) + Math.pow(y1-y2 ,2 ),0.5);

        System.out.println("The distance between the two points is " + distance);

    }
}
