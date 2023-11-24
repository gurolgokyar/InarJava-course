package week_11_inheritanceAndPolymorphism.assignments.exercise_11_13;

import week_11_inheritanceAndPolymorphism.assignments.exercise_11_11.Question_11_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getNumbers(10);
        removeDuplicate(list);
        Question_11_11.displayArray(list);
    }

    public static ArrayList<Integer> getNumbers(int numberOfInputs) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter " + numberOfInputs + " integers: ");
        for (int i = 0; i < numberOfInputs; i++) {
            list.add(input.nextInt());
        }
        return list;
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (list.get(j).intValue() == list.get(i).intValue()) {
                    list.remove(i);
                    break;
                }
            }
        }
    }
}
