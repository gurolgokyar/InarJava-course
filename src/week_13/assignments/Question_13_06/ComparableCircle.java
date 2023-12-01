package week_13.assignments.Question_13_06;

import week_13.workingArea.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    public ComparableCircle(){
        this(1);
    }

    public ComparableCircle(double radius){
        super(radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
       if (this.getArea() > o.getArea()){
           return 1;
       } else if (this.getArea() == o.getArea()) {
           return 0;
       }else{
           return -1;
       }
    }
}
