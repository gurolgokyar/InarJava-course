package week_09.classes;

public class TestSimpleCircle {
    public static void main(String[] args) {
        SimpleCircle circle1 = new SimpleCircle();
        SimpleCircle circle2 = new SimpleCircle(25);
        SimpleCircle circle3 = new SimpleCircle(125);

        System.out.println("The are of the circle of radius " + circle1.radius + " is " + circle1.getArea());
        System.out.println("The are of the circle of radius " + circle2.radius + " is " + circle2.getArea());
        System.out.println("The are of the circle of radius " + circle3.radius + " is " + circle3.getArea());

        circle2.setRadius(100);
        System.out.println("The are of the circle of radius " + circle2.radius + " is " + circle2.getArea());
    }
}
