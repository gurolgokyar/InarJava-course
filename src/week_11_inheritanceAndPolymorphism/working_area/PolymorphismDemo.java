package week_11_inheritanceAndPolymorphism.working_area;

import week_11_inheritanceAndPolymorphism.working_area.extendedClassesOfGeometricObject.CircleFromSimpleGeometricObject;
import week_11_inheritanceAndPolymorphism.working_area.extendedClassesOfGeometricObject.RectangleFromSimpleGeometricObject;

public class PolymorphismDemo {
    public static void main(String[] args) {
        displayObject(new CircleFromSimpleGeometricObject(1, "red", false));
        displayObject(new RectangleFromSimpleGeometricObject(1, 1, "black", true));
    }

    public static void displayObject(SimpleGeometricObject object){
       if(object instanceof CircleFromSimpleGeometricObject){
           System.out.println("The circle area is " + ((CircleFromSimpleGeometricObject)object).getArea());
           System.out.println("The circle diameter is " + ((CircleFromSimpleGeometricObject)(object)).getDiameter());
       } else if (object instanceof RectangleFromSimpleGeometricObject) {
           System.out.println("The rectangle area is " + (((RectangleFromSimpleGeometricObject) object).getArea()));
       }
    }
}
