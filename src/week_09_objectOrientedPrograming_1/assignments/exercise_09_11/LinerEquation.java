package week_09_objectOrientedPrograming_1.assignments.exercise_09_11;

public class LinerEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinerEquation(double[] coefficient) {
        this.a = coefficient[0];
        this.b = coefficient[1];
        this.c = coefficient[2];
        this.d = coefficient[3];
        this.e = coefficient[4];
        this.f = coefficient[5];
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

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public double getX() {
        return (this.e * this.d - this.b * this.f) / (this.a * this.d - this.b * this.c);
    }

    public double getY() {
        return (this.a * this.f - this.e * this.c) / (this.a * this.d - this.b * this.c);
    }
    public boolean isSolvable(){
        return this.a * this.d - this.b * this.c != 0;
    }
    public String toString(){
        String s;
        if(this.isSolvable()){
            s = "x is " + this.getX() + " and y is " + getY();
        }else{
            s = "The equation has no solution";
        }
        return s;
    }
}
