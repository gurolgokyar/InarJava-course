package week_04_StringsAndCharacters.assignments;

public class Question_04_06 {
    public static void main(String[] args) {

        //Generate three random points
        double angle1 = Math.random() * Math.PI * 2;
        double angle2 = Math.random() * Math.PI * 2;
        double angle3 = Math.random() * Math.PI * 2;

        //Find the points' coordinates
        double point1x = 40 * Math.cos(angle1);
        double point1y = 40 * Math.sin(angle1);

        double point2x = 40 * Math.cos(angle2);
        double point2y = 40 * Math.sin(angle2);

        double point3x = 40 * Math.cos(angle3);
        double point3y = 40 * Math.sin(angle3);

        //To find the angles of triangle,you need length of sides
        double side1 = Math.sqrt((point1x - point2x) * (point1x - point2x) + (point1y - point2y) * (point1y - point2y));
        double side2 = Math.sqrt((point1x - point3x) * (point1x - point3x) + (point1y - point3y) * (point1y - point3y));
        double side3 = Math.sqrt((point3x - point2x) * (point3x - point2x) + (point3y - point2y) * (point3y - point2y));

        //Now find the degrees of angles
        double angleA =
                Math.toDegrees(Math.acos((side1 * side1 - side2 * side2 - side3 * side3) / (-2 * side2 * side3)));
        double angleB =
                Math.toDegrees(Math.acos((side2 * side2 - side1 * side1 - side3 * side3) / (-2 * side1 * side3)));
        double angleC =
                Math.toDegrees(Math.acos((side3 * side3 - side2 * side2 - side1 * side1) / (-2 * side2 * side1)));

        //Display the results
        System.out.println("The three angles are : " + angleA + " " + angleB + " " + angleC);

    }
}
