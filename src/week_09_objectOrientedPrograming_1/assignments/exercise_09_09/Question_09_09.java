package week_09_objectOrientedPrograming_1.assignments.exercise_09_09;

public class Question_09_09 {
    public static void main(String[] args) {
        RegularPolygon regularPolygon1 = new RegularPolygon();
        RegularPolygon regularPolygon2= new RegularPolygon(6,4);
        RegularPolygon regularPolygon3 = new RegularPolygon(10,4,5.6,7.8);
        System.out.println("First " + regularPolygon1);
        System.out.println("Second " + regularPolygon2);
        System.out.println("Third " + regularPolygon3);
    }
}
