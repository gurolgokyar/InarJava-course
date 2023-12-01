package week_13.assignments.Question_13_07;

import week_13.assignments.Question_13_01.Triangle;
import week_13.workingArea.Circle;
import week_13.workingArea.GeometricObject;
import week_13.workingArea.Rectangle;

public class Question_13_07 {
    public static void main(String[] args) {
        GeometricObject[] array = {new Circle(5), new Rectangle(3, 4), new Triangle(6, 7, 3), new Square(5), new Square(0)};
        displayArray(array);
    }

    public static void displayArray(GeometricObject[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Area of the geometric Object in the index " + i + " is: " + array[i].getArea());
            if (array[i] instanceof Colorable) {
                ((Colorable) array[i]).howToColor();
            }
            System.out.println("--------------------------------------------------");
        }
    }
}
