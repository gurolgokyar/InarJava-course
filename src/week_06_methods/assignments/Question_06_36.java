package week_06_methods.assignments;

import java.util.Scanner;

public class Question_06_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int side = input.nextInt();

        System.out.print("Enter the side: ");
        double length = input.nextDouble();

        System.out.println("The area of the polygon is " + getArea(side,length));
    }
    public static double getArea(int s, double length){
        return (s * length *length) / (4 * Math.tan(Math.PI / s));
    }
}
