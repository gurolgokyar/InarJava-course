package week_11_objectOrientedPrograming_3.assignments.exercise_11_10;

import java.util.ArrayList;

public class MyStack extends ArrayList {

    public MyStack() {

    }

    public ArrayList<String> revers() {
       ArrayList<String> list = new ArrayList<>();
        for (int i = super.size() - 1; i >= 0 ; i--) {
            list.add(String.valueOf(super.get(i)));
        }
        return list;
    }

    public String toString() {
        return "Stack: " + super.toString();
    }
}
