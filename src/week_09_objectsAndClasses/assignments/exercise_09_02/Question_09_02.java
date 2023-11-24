package week_09_objectsAndClasses.assignments.exercise_09_02;

public class Question_09_02 {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL","Oracle Corporation");
        stock.setCurrentPrice(34.35);
        System.out.println(stock.toString());
    }
}
