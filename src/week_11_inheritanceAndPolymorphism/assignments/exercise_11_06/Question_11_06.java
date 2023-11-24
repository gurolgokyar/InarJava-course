package week_11_inheritanceAndPolymorphism.assignments.exercise_11_06;

import week_09_objectsAndClasses.listings_09.circle.Circle;
import week_10_objectOrientedThinking.workiningArea.loan.Loan;

import java.util.ArrayList;
import java.util.Date;

public class Question_11_06 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        list.add(new Loan(2.5, 1, 1000));
        list.add(new Date());
        list.add(String.valueOf("Don't regret your decisions"));
        list.add(new Circle(1));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
            System.out.println("----------------------------");
        }
    }
}
