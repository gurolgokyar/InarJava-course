package week_09.Questions_09.exercise_09_12;

import week_09.Questions_09.exercise_09_11.LinerEquation;

public class IntersectingPoint {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;
    private double x4;
    private double y4;
    LinerEquation linerEquation = new LinerEquation(this.getCoefficient());


    IntersectingPoint(double[] points) {
        this.x1 = points[0];
        this.y1 = points[1];
        this.x2 = points[2];
        this.y2 = points[3];
        this.x3 = points[4];
        this.y3 = points[5];
        this.x4 = points[6];
        this.y4 = points[7];
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

    public double getX3() {
        return x3;
    }

    public double getY3() {
        return y3;
    }

    public double getX4() {
        return x4;
    }

    public double getY4() {
        return y4;
    }

    public double[] getCoefficient() {
        double a = y1 - y2;
        double b = x1 - x2;
        double c = y3 - y4;
        double d = x3 - x4;
        double e = a * x1 - b * y1;
        double f = c * x3 - d * y3;
        return new double[]{a, b, c, d, e, f};
    }

    public String toString() {
        String s;
        if (linerEquation.isSolvable()) {
            s = "The intersecting point is at (" + linerEquation.getX() + ", " + linerEquation.getY() + ")";
        } else {
            s = "The two lines are parallel";
        }
        return s;
    }
}
