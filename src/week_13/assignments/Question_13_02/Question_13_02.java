package week_13.assignments.Question_13_02;

import java.util.ArrayList;
import java.util.Arrays;

public class Question_13_02 {
    public static void main(String[] args) {
        Number[] numbers = {1, 1.5, 10, 1.53, 5, 12.5, 65};
        ArrayList<Number> list = new ArrayList<>(Arrays.asList(numbers));

        System.out.println("Before shuffle --> " + list);
        shuffle(list);
        System.out.println("After shuffle --> " + list);
    }
    public static void shuffle(ArrayList<Number> list){
        int random;
        for (int i = 0; i < list.size(); i++) {
            random = (int) (Math.random() * list.size());
            Number number = list.get(i);
            Number number1 = list.get(random);
            list.set(random, number);
            list.set(i, number1);
        }
    }
}
