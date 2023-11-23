package week_12_exceptionHandling.assignments.exercise_12_15;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Question_12_15 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/week_12_exceptionHandling/assignments/exercise_12_15/Question_12_15" +
                ".txt");
        PrintWriter output = getOutput(file);
        ArrayList<Integer> list = getNumbers(file);
        displayArray(list);
    }

    public static PrintWriter getOutput(File file) throws IOException {
        PrintWriter output = new PrintWriter(file);
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            output.print(random.nextInt(100) + " ");
        }
        output.close();
        return output;
    }

    public static ArrayList<Integer> getNumbers(File file) throws IOException {
        Scanner input = new Scanner(file);
        ArrayList<Integer> list = new ArrayList<>();
        while (input.hasNext()) {
            list.add(Integer.parseInt(input.next()));
        }
        input.close();
        return list;
    }

    public static void displayArray(ArrayList list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
