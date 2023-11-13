package week_09_objectOrientedPrograming_1.listings_09.circle;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println(circle.toString());
    }
}
