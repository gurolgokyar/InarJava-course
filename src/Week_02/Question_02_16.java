package Week_02;

import java.util.Scanner;

public class Question_02_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side :");
        double side = input.nextDouble();

        //Calculate the area of the hexagon
        double area = (3*Math.pow(3,0.5)) / 2 * side * side;

        System.out.println("The area of the hexagon is " +(int) (area *10000) / 10000.0);

    }
}
