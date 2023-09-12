package week_03;

import java.util.Scanner;

public class Question_03_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point with two coordinate :");
        double x = input.nextDouble();
        double y = input.nextDouble();

        //Check whether the point is in the rectangle
        boolean isxInside =(-5<=x && x<=5);
        boolean isyInside =(-5.0/2<=y && y<=5.0/2);
        if(isxInside && isyInside){
            System.out.println("Point (" + x + "," + y + ") is in the rectangle");
        }
        else {
            System.out.println("Point (" + x + "," + y + ") is not in the rectangle");
        }

    }
}
