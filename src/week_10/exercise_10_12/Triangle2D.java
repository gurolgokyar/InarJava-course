package week_10.exercise_10_12;

import week_10.exercise_10_04.MyPoint;
import week_10.exercise_10_11.Circle2D;

public class Triangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public Triangle2D() {
        this(new MyPoint(0,0),new MyPoint(1,1),new MyPoint(2,5));
    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

    public double getArea() {
        double[] sides = getSides(p1, p2, p3);
        double s = (sides[0] + sides[1] + sides[2]) / 2;
        return Math.sqrt(s * (s - sides[0]) * (s - sides[1]) * (s - sides[2]));

    }

    public double[] getSides(MyPoint p1, MyPoint p2, MyPoint p3) {
        double[] sides = new double[3];
        sides[0] = getSide(p1, p2);
        sides[1] = getSide(p1, p3);
        sides[2] = getSide(p2, p3);
        return sides;
    }

    public double getSide(MyPoint p1, MyPoint p2) {
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }

    public double getPerimeter(){
        double[] sides = getSides(p1,p2,p3);
        return sides[0] + sides[1] + sides[2];
    }
    public boolean contains(MyPoint p){
        double sumOfDistance = getSide(p,p1) + getSide(p,p2) + getSide(p,p3);
        double s = (getSides(p1,p2,p3)[0] + getSides(p1,p2,p3)[1] +getSides(p1,p2,p3)[2]) / 2;
        return sumOfDistance <= 2 * s;
    }
    public boolean contains(Triangle2D t){
        return contains(t.getP1()) && contains(t.getP2()) && contains(t.getP3());
    }

    public boolean overLaps(Triangle2D t){
        //We can firstly generate two circles surrounding those triangles
        double circle1_x = (t.getP1().getX() + t.getP2().getX() + t.getP3().getX()) / 3;
        double circle1_y = (t.getP1().getY() + t.getP2().getY() + t.getP3().getY()) / 3;
        double r1 = Math.sqrt(t.getArea() / t.getPerimeter());

        double circle2_x = (this.getP1().getX() + this.getP2().getX() + this.getP3().getX()) / 3;
        double circle2_y = (this.getP1().getY() + this.getP2().getY() + this.getP3().getY()) / 3;
        double r2 = Math.sqrt(this.getArea() / this.getPerimeter());

        //And now we can use the methods of Circle2D class
        Circle2D circle1 = new Circle2D(circle1_x,circle1_y,r1);
        Circle2D circle2 = new Circle2D(circle2_x,circle2_y,r2);
        return circle1.overlaps(circle2);
    }

}
