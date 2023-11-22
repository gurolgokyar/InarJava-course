package week_12_exceptionHandling.assignments.excercise_12_05;

import java.util.Arrays;
import java.util.Scanner;

public class Question_12_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the three sides of the triangle --> ");
        try{
            Triangle triangle = new Triangle();
            triangle.setSide1(input.nextDouble());
            triangle.setSide2(input.nextDouble());
            triangle.setSide3(input.nextDouble());

            System.out.printf("Triangle: side1 = %1.1f side2 = %1.1f side3 = %1.1f\n" , triangle.getSide1(),
                    triangle.getSide2(),triangle.getSide3());
            System.out.println("The perimeter of the triangle is " + triangle.getPerimeter());
            System.out.println("The area of triangle is " + triangle.getArea());

        }catch (IllegalTriangleException | IllegalArgumentException ex){
            System.out.println(Arrays.toString(ex.getStackTrace()));

        }

    }
}
