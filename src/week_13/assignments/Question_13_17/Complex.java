package week_13.assignments.Question_13_17;

public class Complex implements Cloneable {
    private double a;
    private double b;

    public Complex() {
        this(0);
    }

    public Complex(double a) {
        this(a, 0);
    }

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getRealPart() {
        return a;
    }

    public double getImaginary() {
        return b;
    }

    public String toString() {
        return "(" + a + (b == 0 ? "" : ((b > 0 ? " + " : " - ") + Math.abs(b) + "i)"));
    }

    public Complex add(Complex number) {
        double realPart = getRealPart() + number.getRealPart();
        double imaginaryPart = getImaginary() + number.getImaginary();
        return new Complex(realPart, imaginaryPart);
    }

    public Complex subtract(Complex number) {
        double realPart = getRealPart() - number.getRealPart();
        double imaginaryPart = getImaginary() - number.getImaginary();
        return new Complex(realPart, imaginaryPart);
    }

    public Complex multiply(Complex number) {
        double realPart = getRealPart() * number.getRealPart() - getImaginary() * number.getImaginary();
        double imaginaryPart = getImaginary() * number.getRealPart() + getRealPart() * number.getImaginary();
        return new Complex(realPart, imaginaryPart);
    }

    public Complex divide(Complex number) {
        double realPart =
                (int)((getRealPart() * number.getRealPart() + getImaginary() * number.getImaginary()) / (Math.pow(number.getRealPart(), 2) + Math.pow(number.getImaginary(), 2)) * 100) / 100.0;
        double imaginaryPart =
                (int) ((getImaginary() * number.getRealPart() + getRealPart() * number.getImaginary()) / (Math.pow(number.getRealPart(), 2) + Math.pow(number.getImaginary(), 2)) * 100) / 100.0;

        return new Complex(realPart, imaginaryPart);
    }

    public double abs(){
        return Math.sqrt(Math.pow(getRealPart(), 2) + Math.pow(getImaginary(), 2));
    }

    public Complex clone()throws CloneNotSupportedException{
        Complex clone = (Complex) super.clone();
        return clone;
    }
}
