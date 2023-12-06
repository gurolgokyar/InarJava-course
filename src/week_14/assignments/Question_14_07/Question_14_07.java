package week_14.assignments.Question_14_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Question_14_07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getList();
        System.out.println("Generated list: " + list);

        ArrayList<Integer> distinctNumbers = getDistinctNumbers(list);
        int randomLargest = (int)(Math.random() * distinctNumbers.size());
        Collections.sort(distinctNumbers, Collections.reverseOrder());

        System.out.println("What is the " + (randomLargest + 1) + ". greatest number?");
        System.out.println("The " + (randomLargest + 1) + ". largestNumber is: " + distinctNumbers.get(randomLargest));
    }

    public static ArrayList<Integer> getList(){
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }

        return list;
    }

    public static ArrayList<Integer> getDistinctNumbers(ArrayList<Integer> list){
        ArrayList<Integer> distinctNumbers = new ArrayList<>();

        for (int i = 0; i< list.size(); i++){
            if (!distinctNumbers.contains(list.get(i))){
                distinctNumbers.add(list.get(i));
            }
        }
        return distinctNumbers;
    }
}
