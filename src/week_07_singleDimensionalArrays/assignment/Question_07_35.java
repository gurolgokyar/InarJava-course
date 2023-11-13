package week_07_singleDimensionalArrays.assignment;

import java.util.Scanner;

public class Question_07_35 {
    public static void main(String[] args) {
        playHangMan();
    }

    public static void playHangMan() {
        String[] words = {"hello", "world", "program", "java", "letter", "word", "asterisk", "association"};
        int number = (int) (Math.random() * words.length);
        String wordToGuess = words[number];

        startGame(wordToGuess);
    }

    public static void startGame(String word) {
        char[] ch = new char[word.length()];
        java.util.Arrays.fill(ch, '*');
        displayTheWord(word, ch);
    }

    public static void displayTheWord(String word, char[] ch) {
        Scanner input = new Scanner(System.in);
        String chInString = convertToString(ch);

        int numberOfFalseAnswer = 0;

            while (!chInString.equals(word)) {
                System.out.print("Guess a letter in word ");

                for (char v : ch) {
                    System.out.print(v);
                }
                System.out.print("-->");

                String str = input.next();
                char answer = str.charAt(0);

                int numberOfLetterAnswerNotMached = 0;
                for (int i = 0; i < word.length(); i++) {
                    if (ch[i] == answer) {
                        System.out.println(answer + " is already in the word");
                        break;
                    } else if (word.charAt(i) == answer) {
                        ch[i] = answer;
                    } else {
                        numberOfLetterAnswerNotMached++;
                    }
                }
                if (numberOfLetterAnswerNotMached == word.length()){
                    numberOfFalseAnswer++;
                    System.out.println(answer + " is not in the word");
                }
                chInString = convertToString(ch);
            }
            System.out.println("The word is " + word + ". You missed " + numberOfFalseAnswer);
            System.out.println("Do you want to guess another word? Enter y or n >");
            String answer = input.next();

            while (answer.equals("y")){
                playHangMan();
            }
    }

    public static String convertToString(char[] ch) {
        String str = "";
        for (char v : ch) {
            str += v;
        }
        return str;
    }
}
