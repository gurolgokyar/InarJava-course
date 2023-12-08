package week_14.assignments.Question_14_14;

import java.sql.Array;
import java.util.*;

public class Question_14_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the words: ");

        ArrayList<String> words = new ArrayList<>();
        String word = input.next();
        while (!word.equals("-1")){
            words.add(word);
            word = input.next();
        }

        ArrayList<String> types = findTypes(words);
        displayTheAnagram(words, types);
    }

    public static ArrayList<String> findTypes(ArrayList<String> list){
        ArrayList<String> types = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String wordInType = findTheWordTyp(list.get(i));
            if (!types.contains(wordInType)){
                types.add(wordInType);
            }
        }
        return types;
    }

    public static String findTheWordTyp(String word){
        char[] wordInArray = word.toCharArray();
         Arrays.sort(wordInArray);
        return String.valueOf(wordInArray);
    }

    public static void displayTheAnagram(ArrayList<String> words, ArrayList<String> types){
        Map<String, ArrayList<String>> diagram = new HashMap<>();

        for (int i = 0; i < words.size(); i++) {
            String wordType = findTheWordTyp(words.get(i));
            ArrayList<String> value = new ArrayList<>();
            ArrayList<String> currentValue = diagram.get(wordType); // If there isn't any value corresponding to key,
            // the value will be null

            value.add(words.get(i));
            if (currentValue != null){ // If currentValue is null, there would be RuntimeException
                value.addAll(currentValue);
            }

            diagram.put(wordType,value);
        }

        System.out.println("Original list of words: " + words);
        System.out.print("Anagram groups: ");
        for (Map.Entry<String, ArrayList<String>> entry: diagram.entrySet()){
            System.out.print(entry.getValue());
        }
    }
}
