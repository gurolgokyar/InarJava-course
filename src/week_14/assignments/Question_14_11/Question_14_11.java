package week_14.assignments.Question_14_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question_14_11 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a java source code file: ");
        File file = new File(input.next());

        Scanner input1 = new Scanner(file);

        // Get the all of {, (, [
        ArrayList<Character> list = getSymbol(input1);
        boolean isCorrect = isCorrect(list);
    }

    public static ArrayList<Character> getSymbol(Scanner input){
        ArrayList<Character> list = new ArrayList<>();
        ArrayList<Character> characterToSearch = new ArrayList<>(Arrays.asList( '(', ')', '{', '}', '[', ']'));

        while (input.hasNext()){
            String line = input.nextLine();
            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                if (characterToSearch.contains(ch)) {
                    list.add(ch);
                }
            }
        }
        return list;
    }

    public static boolean isCorrect(ArrayList<Character> list){

        for (int i = 0; i < list.size() - 1; i++) {

        }
        return true;
    }
}
