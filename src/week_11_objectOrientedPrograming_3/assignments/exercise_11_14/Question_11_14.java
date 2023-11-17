package week_11_objectOrientedPrograming_3.assignments.exercise_11_14;

import week_11_objectOrientedPrograming_3.assignments.exercise_11_11.Question_11_11;
import week_11_objectOrientedPrograming_3.assignments.exercise_11_13.Question_11_13;

import java.util.ArrayList;


public class Question_11_14 {
    public static void main(String[] args) {
        System.out.print("For list1 ");
        ArrayList<Integer> list1 = Question_11_13.getNumbers(5);
        System.out.print("For list2 ");
        ArrayList<Integer> list2 = Question_11_13.getNumbers(5);

        ArrayList<Integer> union = union(list1, list2);
        System.out.print("The combined list is ");
        Question_11_11.displayArray(union);
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int i = 0; i < list2.size(); i++) {
            list1.add(list2.get(i));
        }
        return list1;
    }

}
