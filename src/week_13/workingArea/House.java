package week_13.workingArea;

import java.util.Date;

public class House implements Cloneable,Comparable<House> {
    private int id;
    private double area;
    private Date whenBuilt;
    public House(int id, double area){
        this.id = id;
        this.area = area;
        whenBuilt = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    public Date getWhenBuilt(){
        return whenBuilt;
    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
     public int compareTo(House o){
        if (area > o.area){
            return 1;
        } else if (area == 0) {
            return 0;
        }else{
            return -1;
        }
    }

}
