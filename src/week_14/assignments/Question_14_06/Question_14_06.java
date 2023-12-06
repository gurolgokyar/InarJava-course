package week_14.assignments.Question_14_06;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Question_14_06 {
    public static void main(String[] args) {
        Integer[] array = {38, 30, 34, 69, 17, 91, 89, 33, 57, 52};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        System.out.println("Original List: " + list);

        ArrayList<Integer> modifiedList = rearrangedList(list);
        System.out.println("Rearranged List: " + modifiedList);
    }

    public static ArrayList<Integer> rearrangedList(ArrayList<Integer> list){
          ArrayList<Integer> modifiedList = new ArrayList<>();
          int indexOfInsert = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0){
                modifiedList.add(indexOfInsert++, list.get(i));
            }else {
                modifiedList.add(list.get(i));
            }
        }

        return modifiedList;
    }
}
