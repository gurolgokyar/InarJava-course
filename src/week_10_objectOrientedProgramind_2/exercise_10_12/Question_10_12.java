package week_10_objectOrientedProgramind_2.exercise_10_12;

import week_10_objectOrientedProgramind_2.exercise_10_04.MyPoint;

public class Question_10_12 {
    public static void main(String[] args) {
        Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5));
        System.out.println("Area: " + t1.getArea());
        System.out.println("Perimeter: " + t1.getPerimeter());
        System.out.println("t1 contains (3,3) ? : " + t1.contains(new MyPoint(3,3)));
        System.out.println("t1 contains (new Triangle2D(new MyPoint(2.9, 2) ,new MyPoint(4, 1), new MyPoint(1, 3.4)) " +
                "? : " + t1.contains (new Triangle2D(new MyPoint(2.9, 2) ,new MyPoint(4, 1), new MyPoint(1, 3.4))));
        System.out.println("t1 overlaps(new Triangle2D(new MyPoint(2, 5.5) ,new MyPoint(4, -3), new MyPoint(2, 6.5)) " +
                "? : " + t1.overLaps(new Triangle2D(new MyPoint(2, 5.5) ,new MyPoint(4, -3), new MyPoint(2, 6.5))));
    }
}
