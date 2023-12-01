package week_13.assignments.Question_13_01;

import java.nio.charset.IllegalCharsetNameException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_13_01 {
    public static void main(String[] args) {
         Triangle triangle = generateTheTriangle();
        System.out.println(triangle);
    }
    public static Triangle generateTheTriangle(){
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the three side of the triangle: ");
            Triangle triangle = new Triangle(input.nextDouble(), input.nextDouble(), input.nextDouble());
            System.out.print("Enter the color: ");
            triangle.setColor(input.next());
            System.out.println("Enter : isFilled ? true or false : ");
            triangle.setFilled(input.nextBoolean());

            return triangle;

        }catch (InputMismatchException ex){
            System.out.println("Invalid  input!");
            System.exit(1);
        }

        return null;
    }
}
