package week_14.assignments.Question_14_16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question_14_16 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\user\\OneDrive\\Masaüstü\\WorkSpace\\InarAcademy_Java_course\\src\\week_14" +
                "\\assignments\\sourse.txt");
        Scanner input = new Scanner(file);
        Map<String, Integer> numberOfWords = new HashMap<>();

        while (input.hasNext()){
            String line = input.nextLine();
            String words[] = line.split("[\\n\\s.-\\\\_]");

            for (int i = 0; i < words.length; i++) {
                if (numberOfWords.containsKey(words[i])){
                    numberOfWords.replace(words[i], numberOfWords.get(words[i])+ 1);
                }else {
                    numberOfWords.put(words[i],1);
                }
            }
        }
    }
}
