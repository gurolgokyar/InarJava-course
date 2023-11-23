package week_12_exceptionHandling.assignments.exercise_12_17;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Question_12_17 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter wordlist file pathname for Hangman game:  ");
        String filePath = input.next();

        File file = new File(filePath);
        if (!file.exists()) {
            System.out.print("The file you entered does not exist!");
            System.exit(1);
        }
        String word = new Scanner(file).next();
        String wordInAstrix = getWordInAstrix(word);
        int numberOfInputsIsAlreadyInWord = 0;

        while (word.compareTo(wordInAstrix) != 0) {
            System.out.print("(Guess)Enter a letter in word -->" + wordInAstrix + " : ");
            char ch = input.next().charAt(0);
            if (isContains(wordInAstrix, ch)) {
                System.out.println(ch + " is already in the word");
            } else if (isContains(word, ch)) {
                wordInAstrix = changeCharacters(wordInAstrix,word, ch);
            } else {
                System.out.println(ch + " is not in the word");
                numberOfInputsIsAlreadyInWord++;
            }
        }
        System.out.println("The word is " + "\"" + word + "\". You missed " + numberOfInputsIsAlreadyInWord + (numberOfInputsIsAlreadyInWord >1 ?
                " times" : " time"));
    }

    public static String getWordInAstrix(String word) {
        String str = "";
        for (int i = 0; i < word.length(); i++) {
            str += '*';
        }
        return str;
    }

    public static String changeCharacters(String wordInAstrix, String word, char ch) {
        String str = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                str += ch;
            } else {
                str += wordInAstrix.charAt(i);
            }
        }
        return str;
    }

    public static boolean isContains(String word, char ch) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch){
                return true;
            }
        }
        return false;
    }
}
