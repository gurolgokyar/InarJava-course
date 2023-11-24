package week_11_inheritanceAndPolymorphism.assignments.exercise_11_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter a list of integers ending with 0: ");
        do {
            number = input.nextInt();
            if (number != 0) {
                list.add(number);
            }
        } while (number != 0);

        System.out.println("Before sorting:");
        displayArray(list);

        sort(list);
        System.out.println("After sorting:");
        displayArray(list);
    }
    public static void displayArray(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void sort(ArrayList<Integer> list){
        //You can use java.util.Collections.sort(list)

        for (int i = 0; i < list.size() - 1; i++) {
            Integer min = list.get(i);
            int index = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < min){
                    min = list.get(j);
                    index = j;
                }
            }
            if (index != i){
                list.set(index, list.get(i));
                list.set(i,min);
            }
        }
    }
}
