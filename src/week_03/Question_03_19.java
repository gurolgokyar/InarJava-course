package week_03;

import java.util.Scanner;

public class Question_03_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three edges of triangle:");
        double edge1 = input.nextDouble();
        double edge2 = input.nextDouble();
        double edge3 = input.nextDouble();

        //find the perimeter if the triangle possible
        if (edge1 > 0 && edge2 > 0 && edge3 > 0) {
            if (edge1 + edge2 > edge3 || edge1 + edge3 > edge2 || edge2 + edge3 > edge1)
                System.out.println("The perimeter is " + (edge2 + edge1 + edge3));
            else
                System.out.println("The input is invalid");
        } else
            System.out.println("The input is invalid ");
    }
}
