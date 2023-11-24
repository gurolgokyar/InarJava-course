package week_11_inheritanceAndPolymorphism.assignments.exercise_11_15;

public class MyPoints {
    private double[] p1;
    private double[] p2;
    private double[] p3;

    public MyPoints() {
        this(new double[]{0, 0}, new double[]{0, 0}, new double[]{0, 0});
    }

    public MyPoints(double[] p1, double[] p2, double[] p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double[] getP1() {
        return p1;
    }

    public void setP1(double[] p1) {
        this.p1 = p1;
    }

    public double[] getP2() {
        return p2;
    }

    public void setP2(double[] p2) {
        this.p2 = p2;
    }

    public double[] getP3() {
        return p3;
    }

    public void setP3(double[] p3) {
        this.p3 = p3;
    }

    public double getArea() {
        double[] sides = getSides(p1, p2, p3);
        double s = (sides[0] + sides[1] + sides[2]) / 2;
        return Math.sqrt(s * (s - sides[0]) * (s - sides[1]) * (s -sides[2]));
    }

    public double[] getSides(double[] p1, double[] p2, double[] p3) {
        double s1 = getSide(p1, p2);
        double s2 = getSide(p1, p3);
        double s3 = getSide(p2, p3);

        return new double[]{s1, s2, s3};
    }

    public double getSide(double[] p1, double[] p2) {
        return Math.sqrt(Math.pow(p1[0] - p2[0], 2) + Math.pow(p1[1] - p2[1], 2));
    }
}
