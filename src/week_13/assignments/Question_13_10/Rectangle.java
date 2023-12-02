package week_13.assignments.Question_13_10;

import org.w3c.dom.css.Rect;
import week_13.workingArea.GeometricObject;

public class Rectangle extends GeometricObject implements Comparable<Rectangle> {
    private double width;
    private double height;

    public Rectangle(){
        this(1, 1);
    }

    public Rectangle(double width, double height){
        this(width, height, "White",false);
    }

    public Rectangle(double width, double height, String color, boolean filled){
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return width *height;
    }

    public double getPerimeter(){
        return 2 * (width + height);
    }

    public int compareTo(Rectangle o){
        if (getArea() > o.getArea()){
            return 1;
        } else if (getArea() == o.getArea()) {
            return 0;
        }else{
            return -1;
        }
    }

    public boolean equals(Rectangle o){
        return getArea() == o.getArea();
    }
}
