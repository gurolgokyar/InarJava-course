package week_14.assignments.Question_14_17;

import java.util.*;

public class Question_14_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Map<Integer, Integer> map = new HashMap();
        System.out.println("Enter integers (enter 0 to stop): ");
        int number = input.nextInt();
        int maxOccurrence = 0;

       while (number != 0){
           if (map.containsKey(number)){
               map.replace(number, map.get(number) + 1);
               if (map.get(number) > maxOccurrence){
                   maxOccurrence = map.get(number);
               }
           }else {
               map.put(number,1);
           }

           number = input.nextInt();
       }

       ArrayList<Integer> numbersHasMaxOccurrences = findNumbersHasMaxOccurrences(map, maxOccurrence);
        System.out.println("Number(s) with the most occurrence: " + numbersHasMaxOccurrences + " --> " + maxOccurrence + " time(s).");
    }

    public static ArrayList<Integer> findNumbersHasMaxOccurrences(Map<Integer, Integer> map, int maxOccurrence){
        ArrayList<Integer> numbersHasMaxOccurrences = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() == maxOccurrence){
                numbersHasMaxOccurrences.add(entry.getKey());
            }
        }

        return numbersHasMaxOccurrences;
    }
}
