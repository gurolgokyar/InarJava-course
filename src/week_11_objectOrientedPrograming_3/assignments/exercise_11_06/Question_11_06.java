package week_11_objectOrientedPrograming_3.assignments.exercise_11_06;

import week_09_objectOrientedPrograming_1.listings_09.circle.Circle;
import week_10_objectOrientedProgramind_2.workiningArea.loan.Loan;

import javax.sound.sampled.DataLine;
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
