package week_14.assignments.Question_14_13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Question_14_13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getRandomNumbers();
        Map<Integer, Integer> numberOfIntegers = getNumberOfIntegers(list);
        ArrayList<Integer> nDivideThreeNumbers = getNDivideThreeNumbers(numberOfIntegers, list.size());

        System.out.println("Generated integers: " + list);
        System.out.println((nDivideThreeNumbers.size() > 0) ?
                "Elements appear more than n/3 times: " + nDivideThreeNumbers : "There isn'n any element eppearing " +
                "more than n/3 times");
    }

    public static ArrayList<Integer> getRandomNumbers(){
        Random random = new Random();
        int numberOfInteger = random.nextInt(10);

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < numberOfInteger; i++) {
            result.add(random.nextInt(3));
        }

        return result;
    }

    public static Map<Integer, Integer> getNumberOfIntegers(ArrayList<Integer> list){
        Map<Integer, Integer> numberOfInteger = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            if (numberOfInteger.containsKey(list.get(i))){
                numberOfInteger.put(list.get(i), numberOfInteger.get(list.get(i)) + 1);
            }else {
                numberOfInteger.put(list.get(i), 1);
            }
        }

        return numberOfInteger;
    }

    public static ArrayList<Integer> getNDivideThreeNumbers(Map<Integer, Integer> map, int n){
        ArrayList<Integer> result = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() > n / 3.0){
                result.add(entry.getKey());
            }
        }

        return result;
    }
}
