package week_12_exceptionHandling.workingArea;

public class CircleWithException {
    private double radius;
    private static int numberOfObject;

    public CircleWithException() {
        this(1);
    }

    public CircleWithException(double radius) {
        setRadius(radius);
        numberOfObject++;
    }

    public void setRadius(double radius) throws IllegalArgumentException {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius can not be negative!");
        }
    }

    public double getRadius() {
        return radius;
    }

    public static int getNumberOfObject() {
        return numberOfObject;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

