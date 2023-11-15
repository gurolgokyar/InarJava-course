package week_11_objectOrientedPrograming_3.assignments.exercise_11_01;

import week_11_objectOrientedPrograming_3.working_area.SimpleGeometricObject;

import java.util.Scanner;

public class Question_11_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sides if the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        Triangle o = new Triangle(side1, side2, side3);

        System.out.println("Enter a color: ");
        input.nextLine();
        String color = input.nextLine();
        o.setColor(color);

        System.out.println("Is the triangle filled (true / false) ? ");
        boolean isFilled = input.nextBoolean();
        o.setFilled(isFilled);

        System.out.println(o);
        System.out.println("Area: " + o.getArea());
        System.out.println("Perimeter: " + o.getPerimeter());
        System.out.println("Color: " + o.getColor());
        System.out.println("Triangle is " + (o.isFilled() ? "" : "not ") + "filled");
    }
}
