package week_09.listings_09.circle;

public class Circle {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return this.radius * Math.PI * 2;
    }

    public double getRadius() {
        return this.radius;
    }

    public String toString() {
        return "The area of the circle is " + this.getArea() + " and the perimeter of the circle is " + this.getPerimeter();
    }
}
