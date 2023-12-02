package week_13.assignments.Question_13_11;

import week_13.workingArea.Circle;

public class Question_13_11 {
    public static void main(String[] args) throws CloneNotSupportedException{
        Octagon octagon = new Octagon(5);
        System.out.println("Area: " + octagon.getArea());
        System.out.println("Perimeter: " + octagon.getPerimeter());

        System.out.println("\nCloning the octagon...");
        Octagon octagon1 = octagon.clone();
        System.out.println("Octagon is " + (octagon.compareTo(octagon1) == 0 ? "" : "not ") + "equal to its clone");

    }
}
