package week_13.assignments.Question_13_12;

import week_13.workingArea.Circle;
import week_13.workingArea.GeometricObject;
import week_13.workingArea.Rectangle;

public class Question_13_12 {
    public static void main(String[] args) {
        GeometricObject[] objects = {new Circle(3), new Circle(7), new Rectangle(3, 4), new Rectangle(5, 4)};
        System.out.printf("The area of Geometric Objects: %1.2f\n", sumArea(objects));
    }

    public static double sumArea(GeometricObject[] objects) {
        double sum = 1;
        for (GeometricObject o : objects) {
            sum += o.getArea();
        }
        return sum;
    }
}
