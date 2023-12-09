package week_14.assignments.Question_14_19;

import java.util.*;

public class Question_14_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a DNA sequence --> ");
        String DNA = input.next();

        Map<String, Integer> numberOfSequence = getNumberOfSequence(DNA);
        ArrayList<String> theSequence = findTheSequencesOccurredMoreThanOne(numberOfSequence);

        System.out.println("Repeated 5-letter sequences : " + theSequence);
    }

    public static Map<String, Integer> getNumberOfSequence(String DNA){
        Map<String, Integer> numberOfSequence = new HashMap<>();

        for (int i = 0; i < DNA.length() - 4; i++) {
            String DnaSequence = DNA.substring(i, i + 5);
            if (numberOfSequence.containsKey(DnaSequence)){
                numberOfSequence.replace(DnaSequence, numberOfSequence.get(DnaSequence) + 1);
            }else {
                numberOfSequence.put(DnaSequence, 1);
            }
        }

        return numberOfSequence;
    }

    public static ArrayList<String> findTheSequencesOccurredMoreThanOne(Map<String, Integer> map){
        ArrayList<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if (entry.getValue() > 1){
                result.add(entry.getKey());
            }
        }
        Collections.sort(result);
        return result;
    }
}
