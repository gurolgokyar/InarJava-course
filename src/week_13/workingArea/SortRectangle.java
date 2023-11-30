package week_13.workingArea;

public class SortRectangle {
    public static void main(String[] args) {
        ComparableRectangle[] rectangles = {
                new ComparableRectangle(3.4, 5.4),
                new ComparableRectangle(13.24, 55.4),
                new ComparableRectangle(7.4, 35.4),
                new ComparableRectangle(1.4, 25.4)};
        java.util.Arrays.sort(rectangles);
        for (ComparableRectangle rectangle: rectangles){
            System.out.println(rectangle + " \n");
        }
    }
}
