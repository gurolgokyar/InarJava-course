package week_04_StringsAndCharacters.assignments;

public class Question_04_03 {
    public static void main(String[] args) {
        double atlantaX = Math.toRadians(33.7489954);
        double atlantaY = Math.toRadians(-84.3879824);

        double orlandoX = Math.toRadians(28.5383355);
        double orlandoY = Math.toRadians(-81.3792364999);

        double savannahX = Math.toRadians(32.0835407);
        double savannahY = Math.toRadians(-81.09983419999998);

        double charlotteX = Math.toRadians(35.2270869);
        double charlotteY = Math.toRadians(-80.84312669999997);

        //Find the distances between two cities
        double atlantaOrlando =
                6371.01 * Math.acos(Math.sin(atlantaX) * Math.sin(orlandoX) + Math.cos(atlantaX) * Math.cos(orlandoX) * Math.cos(atlantaY - orlandoY));
        double atlantaCharlotte =
                6371.01 * Math.acos(Math.sin(atlantaX) * Math.sin(charlotteX) + Math.cos(atlantaX) * Math.cos(charlotteX) * Math.cos(atlantaY - charlotteY));
        double atlantaSavannah =
                6371.01 * Math.acos(Math.sin(atlantaX) * Math.sin(savannahX) + Math.cos(atlantaX) * Math.cos(savannahX) * Math.cos(atlantaY - savannahY));
        double savannahOrlando =
                6371.01 * Math.acos(Math.sin(savannahX) * Math.sin(orlandoX) + Math.cos(savannahX) * Math.cos(orlandoX) * Math.cos(savannahY - orlandoY));
        double savannahCharlotte =
                6371.01 * Math.acos(Math.sin(savannahX) * Math.sin(charlotteX) + Math.cos(savannahX) * Math.cos(charlotteX) * Math.cos(savannahY - charlotteY));

        //Find the area between those four cities
        //Firstly find the area between Savannah,atlanta and orlando
        double s = (savannahOrlando + atlantaSavannah + atlantaOrlando) / 2;
        double area1 = Math.pow(s * (s - savannahOrlando) * (s - atlantaSavannah) * (s - atlantaOrlando), 0.5);

        //Secondly find the area between savannah , atalanta and charlotte
        s = (atlantaCharlotte + atlantaSavannah + savannahCharlotte) / 2;
        double area2 = Math.pow(s * (s - atlantaCharlotte) * (s - atlantaSavannah) * (s - savannahCharlotte), 0.5);

        //Plus the two areas
        double area = area1 + area2;

        System.out.println("Estimated area enclosed by these four cities : " + area);
    }

}
