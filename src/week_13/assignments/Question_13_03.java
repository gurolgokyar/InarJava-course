package week_13.assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class Question_13_03 {
    public static void main(String[] args) {
        Number[] numbers = {1, 1.5, 10, 1.53, 5, 10, 12.5, 65};
        ArrayList<Number> list = new ArrayList<>(Arrays.asList(numbers));

        System.out.println("Before sort --> " + list);
        sort(list);
        System.out.println("After sort --> " + list);
    }

    public static void sort(ArrayList<Number> list){
        for (int i = 0; i < list.size() - 1; i++) {
            double minNumber = list.get(i).doubleValue();
            int index = i;
            for (int j = i + 1; j < list.size(); j++) {
                if(list.get(j).doubleValue() < minNumber){
                    minNumber = list.get(j).doubleValue();
                    index = j;
                }
            }

            if(index != i){
                list.set(index, list.get(i));
                list.set(i, minNumber);
            }
        }
    }
}
