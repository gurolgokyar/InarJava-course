package week_14.assignments.Question_14_24;

import java.util.*;

public class Question_14_24 {
    public static void main(String[] args) {
        ArrayList<Integer> list =getNumbers();
        int k = 5; //k may be random number
        boolean isDuplicated = isDuplicated(list, k);
        System.out.println("Array: " + list);
        System.out.println("Is there a nearby duplicate with absolute difference at " + k + "? " + (isDuplicated ?
                "True" : "False"));
    }

    public static ArrayList<Integer> getNumbers(){
        ArrayList<Integer> result = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            result.add(random.nextInt(100));
        }

        return result;
    }

    public static boolean isDuplicated(ArrayList<Integer> list, int k){

        Set<Integer> set = new HashSet<>(list);

        if (set.size() == list.size()){
            return false;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (map.containsKey(list.get(i))){
                if (Math.abs(map.get(list.get(i)) - i) <= k){
                    return true;
                }else {
                    map.put(list.get(i), i);
                }
            }else{
                map.put(list.get(i), i);
            }
        }
        return false;
    }
}
