package week_06_methods.assignments;

import java.util.Scanner;

public class Question_06_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double length = input.nextDouble();

        System.out.println("The area of the pentagon is " + getArea(length));
    }
    public static double getArea(double length){
        return (5 * length * length) / (4 * Math.tan(Math.PI / 5));
    }
}
