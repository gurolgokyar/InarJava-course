package week_14.assignments.Question_14_23;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.*;

public class Question_14_23 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the path of the text file: ");
        File file = new File(input.next());
        Map<String, Integer> numberOfWords = getNumberOfWords(file);
        ArrayList<String> nonDuplicatedWords = getNonDuplicated(numberOfWords);
        displayTheNonDuplicatedWords(nonDuplicatedWords);
    }

    public static Map<String, Integer> getNumberOfWords(File file) throws FileNotFoundException {
        Scanner input = new Scanner(file);
        Map<String, Integer> map = new HashMap<>();

        while(input.hasNext()){
            String line = input.nextLine();
            String[] words = line.split("\\s+");
            for (int i = 0; i < words.length; i++) {
                if (map.containsKey(words[i])){
                    map.replace(words[i], map.get(words[i]) + 1);
                }else{
                    map.put(words[i], 1);
                }
            }
        }

        return map;
    }

    public static ArrayList<String> getNonDuplicated(Map<String, Integer> numberOfWords){
        ArrayList<String> nonDuplicatedWords = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : numberOfWords.entrySet()){
            if (entry.getValue() == 1){
                nonDuplicatedWords.add(entry.getKey());
            }
        }
        Collections.sort(nonDuplicatedWords);
        return nonDuplicatedWords;
    }

    public static void displayTheNonDuplicatedWords(ArrayList<String> words){
        System.out.println((words.isEmpty() ? "There is not any non-duplicate word in the file" : "Non" +
                "-duplicate words in ascending order : "));

        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }
    }
}
