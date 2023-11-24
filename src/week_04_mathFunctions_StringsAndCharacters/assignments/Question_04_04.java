package week_04_mathFunctions_StringsAndCharacters.assignments;

import java.util.Scanner;

public class Question_04_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side :");
        double side = input.nextDouble();

        //Compute the area
        double area = (6*side*side)/(4*Math.tan(Math.PI/6));

        System.out.printf("The area of the hexagon is %3.2f\n", area);
    }

}
