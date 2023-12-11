package week_14.assignments.Question_14_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Question_14_25 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getList();
        int targetSum = (int)(Math.random() * 100);
        ArrayList<Integer> numbers = getNumbers(list, targetSum);

        System.out.println("Generated ArrayList: \n" + list);
        System.out.println("Generated Target Sum : " + targetSum);
        System.out.println((numbers.isEmpty() ? "There is not any pair which sum of equal to target sum\nResult: " +
                "False" : "Numbers are: " + numbers + " Result: True"));
    }

    public static ArrayList<Integer> getList(){
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 15; i++) {
            list.add(random.nextInt(100));
        }

        return list;
    }

    public static ArrayList<Integer> getNumbers(ArrayList<Integer> list, int targetSum){
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == targetSum){
                    return new ArrayList<>(Arrays.asList(list.get(i),list.get(j)));
                }
            }
        }
        return new ArrayList<>();
    }
}
