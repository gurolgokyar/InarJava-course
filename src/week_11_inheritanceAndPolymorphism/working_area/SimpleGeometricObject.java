package week_11_inheritanceAndPolymorphism.working_area;

import java.util.Date;

public class SimpleGeometricObject {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;
    public SimpleGeometricObject(){
       dateCreated = new Date();
    }
    public SimpleGeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    public String toString(){
        return "Color: " + color +
                " Filled: " + filled +
                " DateCreated: " + dateCreated;
    }
}
