package week_04_StringsAndCharacters.assignments;

import java.util.Scanner;

public class Question_04_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex:");
        double length = input.nextDouble();

        double side = 2*length*Math.sin(Math.PI/5);

        //Find the area of pentagon
        double area = (5*side*side)/(4*Math.tan(Math.PI/5));
        System.out.printf("The are of the pentagon is %1.2f\n", area);

    }
}
