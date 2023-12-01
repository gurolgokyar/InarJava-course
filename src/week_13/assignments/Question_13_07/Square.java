package week_13.assignments.Question_13_07;

import week_13.workingArea.GeometricObject;

public class Square extends GeometricObject implements Colorable {
    private double side;

    public Square() {
        this(1);
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void howToColor() {
        System.out.println("Color all four sides");
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter(){
        return side * 4;
    }

}
