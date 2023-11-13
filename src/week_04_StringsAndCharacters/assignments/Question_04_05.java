package week_04_StringsAndCharacters.assignments;

import java.util.Scanner;

public class Question_04_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of side :");
        int numberOfSide= input.nextInt();

        System.out.print("Enter the length of a side :");
        double lengthOfSide= input.nextDouble();

        //Calculate the area of the polygon
        double area = (numberOfSide*lengthOfSide*lengthOfSide)/(4*Math.tan(Math.PI/numberOfSide));

        //display the results
        System.out.printf("The area of the polygon is %3.2f\n",area);
    }
}
