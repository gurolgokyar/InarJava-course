package Week_02;

import java.util.Scanner;

public class Question_02_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter speed and acceleration :");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        double length = (speed *speed) / (2 * acceleration) ;
        System.out.println("The minimum runway length for this airplane is " + (int)(length *1000) /1000.0);

    }
}
