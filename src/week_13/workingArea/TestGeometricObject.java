package week_13.workingArea;

public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject geometricObject1 = new Circle(5);
        GeometricObject geometricObject2 = new Rectangle(5, 3);

        System.out.println("The two objects have the same area? "+ equalArea(geometricObject1, geometricObject2));
        displayGeometricObject(geometricObject1);
        displayGeometricObject( geometricObject2);

    }

    public static boolean equalArea(GeometricObject o1, GeometricObject o2){
        return o1.getArea() == o2.getArea();
    }

    public static void displayGeometricObject(GeometricObject o){
        System.out.println("\nThe area is " + o.getArea());
        System.out.println("The perimeter is " + o.getPerimeter());
    }
}
