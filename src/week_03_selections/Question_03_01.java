package week_03_selections;

import java.util.Scanner;

public class Question_03_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c :");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        //Find the discriminant
        double discriminant = b * b - 4 * a * c ;

        //Find the roots
        if (discriminant > 0){
            double root1 = (-b + Math.pow(discriminant , 0.5)) / (2 * a) ;
            double root2 = (-b - Math.pow(discriminant , 0.5)) / (2 * a) ;
            System.out.println("The equation has twos root " +(int)(root1*100000)/100000.0 + " and " + (int)root2);
        }
        else if (discriminant == 0){
            double root = (-b + Math.pow(discriminant , 0.5)) / (2 * a) ;
            System.out.println("The equation has one root " +(int) (root*100000)/100000.0);
        }
        else {
            System.out.println("The equation has no real root");
        }
    }
}
