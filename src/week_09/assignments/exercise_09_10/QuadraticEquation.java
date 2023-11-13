package week_09.assignments.exercise_09_10;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    double getRoot1() {
        return (-this.b  + Math.sqrt(this.getDiscriminant())) / (this.a * 2);
    }

    double getRoot2() {
        return (-this.b - Math.sqrt(this.getDiscriminant())) / (this.a * 2);
    }

    public String toString() {
        String s;
        if (this.getDiscriminant() < 0) {
            s = "The equation has no root";
        } else if (this.getDiscriminant() == 0) {
            s = "The equation has one root -> " +(int) (this.getRoot1() * 1000) / 1000.0;
        } else {
            s =
                    "The equation has two root -> " + (int) (this.getRoot1() * 1000) / 1000.0 + " and " +(int) (this.getRoot2() * 1000) / 1000.0;
        }
        return s;
    }

}
