package week_14.assignments.Question_14_12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Question_14_12 {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String answer = input.nextLine().trim();

        Map<Character, Integer> numberOfCharacter = getNumberOfCharacter(answer);
        displayTheFirstSingleCharacter(numberOfCharacter, answer);
    }

    public static Map<Character, Integer> getNumberOfCharacter(String answer){
        Map<Character, Integer> result = new LinkedHashMap<>();
        for (int i = 0; i < answer.length(); i++) {
            char ch = answer.charAt(i);
            if (result.containsKey(ch) && ch != ' '){
                result.replace(ch, result.get(ch) + 1);
            }else {
                result.put(ch,1);
            }
        }

        return result;
    }

    public static void displayTheFirstSingleCharacter(Map<Character, Integer> map, String line){
        boolean isDisplayed = false;
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                System.out.println("The first non-repeating character is " + entry.getKey() + ": " + (getIndexOfCharacter(line, entry.getKey()) + 1) + ". character of the string.");
                isDisplayed = true;
                break;
            }
        }

        if (!isDisplayed){
            System.out.println(-1);
        }
    }

    public static int getIndexOfCharacter(String line, char ch){
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ch){
                return i;
            }
        }

        return -1;
    }
}
