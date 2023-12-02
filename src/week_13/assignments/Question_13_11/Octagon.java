package week_13.assignments.Question_13_11;

import week_13.workingArea.GeometricObject;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
    private double side;

    public Octagon(){
        this(1);
    }

    public Octagon(double side){
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea(){
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    public double getPerimeter(){
        return 8 * side;
    }

    public int compareTo(Octagon o){
        if (getArea() > o.getArea()){
            return 1;
        } else if (getArea() == o.getArea()) {
            return 0;
        }else {
            return -1;
        }
    }

    public Octagon clone() throws CloneNotSupportedException{
        Octagon cloneOctal = (Octagon) super.clone();
        return cloneOctal;
    }
}
