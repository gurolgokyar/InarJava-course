package week_13.workingArea;

public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle> {

    public ComparableRectangle(double width, double height){
        super(width, height);
    }
    public int compareTo(ComparableRectangle o){
        if (getArea() > o.getArea()){
            return 1;
        } else if (getArea() == o.getArea()) {
            return 0;
        }else{
            return -1;
        }
    }
    public String toString(){
        return super.toString() + " Area: " + getArea();
    }
}
