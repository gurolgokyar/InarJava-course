package week_14.assignments.Question_14_02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Question_14_02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getList();
        System.out.println("Generated ArrayList:\n" + list);

        Set<Integer> setList = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            setList.add(list.get(i));
        }

        System.out.println("ArrayList after removing duplicates:\n" + setList);
    }

    public static ArrayList<Integer> getList(){
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            list.add(random.nextInt(100));
        }
        return list;
    }
}
