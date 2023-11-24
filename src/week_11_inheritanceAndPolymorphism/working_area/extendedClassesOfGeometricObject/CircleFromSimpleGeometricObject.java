package week_11_inheritanceAndPolymorphism.working_area.extendedClassesOfGeometricObject;

import week_11_inheritanceAndPolymorphism.working_area.SimpleGeometricObject;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject {
    public double radius;
    public CircleFromSimpleGeometricObject(){

    }
    public CircleFromSimpleGeometricObject(double radius){
        this.radius = radius;
    }
    public CircleFromSimpleGeometricObject(double radius, String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    public double getDiameter(){
        return 2 * radius;
    }
    public void print(){
        System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
    }

}
