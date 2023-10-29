package week_09.Questions_09.exercise_09_01;

public class Rectangle {
    private double width;
    private double height;

    Rectangle(){
        this(1,1);
    }
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    double getArea(){
        return this.width * this.height;
    }

    double getPerimeter(){
        return 2* (this.width + this.height);
    }
    public String toString(){

        return "Width    : " + this.width +
                "\nHeight   : " + this.height
                + "\nArea     : " + this.getArea()
                + "\nPerimeter: " + this.getPerimeter();
    }

}
