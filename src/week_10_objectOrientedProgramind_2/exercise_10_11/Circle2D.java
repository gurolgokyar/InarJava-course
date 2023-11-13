package week_10_objectOrientedProgramind_2.exercise_10_11;

import java.awt.geom.Point2D;

public class Circle2D {
    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        this(0, 0, 1);
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public boolean contains(double x, double y) {
        Point2D point2D = new Point2D.Double(x, y);
        double distance = point2D.distance(this.x, this.y);
        return distance < radius;
    }

    public boolean contains(Circle2D circle2D) {
        //because of the circle2D is generated in this class, you may not use
        // circle2D.getRadius method
        if (this.radius <= circle2D.radius) {
            return false;
        }
        Point2D point2D = new Point2D.Double(this.x, this.y);
        double distance = point2D.distance(circle2D.getX(), circle2D.getY());
        return distance + circle2D.getRadius() < radius;
    }

    public boolean overlaps(Circle2D circle2D) {
        Point2D point2D = new Point2D.Double(this.x, this.y);
        double distance = point2D.distance(circle2D.getX(), circle2D.getY());
        return distance + circle2D.getRadius() > radius && distance + circle2D.getRadius() < radius + circle2D.getRadius();
    }
}
