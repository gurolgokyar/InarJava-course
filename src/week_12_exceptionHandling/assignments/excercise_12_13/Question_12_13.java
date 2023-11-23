package week_12_exceptionHandling.assignments.excercise_12_13;

import java.io.File;
import java.util.Scanner;

public class Question_12_13 {
    public static void main(String[] args) throws Exception{
        File file = new File(args[0]);
        Scanner input = new Scanner(file);
        int numberOfCharacter = 0;
        int numberOfWords = 0;
        int numberOfLines = 0;
        while (input.hasNext()){
            String str = input.nextLine();
            String[] array = str.split(" ");
            numberOfLines++;
            numberOfWords += array.length;

            for (int i = 0; i < array.length; i++) {
                numberOfCharacter += array[i].length();
            }
        }
        input.close();
        System.out.printf("%d characters\n%d words\n%d lines", numberOfCharacter,numberOfWords, numberOfLines);
    }
}
