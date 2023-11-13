package week_02_elementaryPrograming;

import java.util.Scanner;

public class Question_02_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter v0(in meters/second) , v1(in meters/second) and t(time) :");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        //Find the average acceleration
        double averageAcceleration = (v1 - v0) / t ;

        System.out.println("The average acceleration is " + (int)(averageAcceleration*10000)/10000.0);
    }
}
