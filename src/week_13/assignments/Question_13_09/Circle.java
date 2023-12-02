package week_13.assignments.Question_13_09;

import week_13.workingArea.GeometricObject;

public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;

    public Circle(){
        this(1);
    }

    public Circle(double radius){
        this.radius = radius;
    }
    public Circle( double radius, String color, boolean filled) {
        this .radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius *radius * Math.PI;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    public boolean equals(Object o){
        if (this.radius == ((Circle)o).getRadius()){
            return true;
        }else {
            return false;
        }
    }

    public int compareTo(Circle o){
        if (this.radius > o.getRadius()){
            return 1;
        } else if (this.radius ==  o.getRadius()) {
            return 0;
        }else {
            return -1;
        }
    }

}
