package week_11_objectOrientedPrograming_3.assignments.exercise_11_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question_11_07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getNumbers();
        System.out.println("Before shuffling..");
        displayArray(list);

        shuffle(list);
        System.out.println("After shuffling");
        displayArray(list);

    }
    public static ArrayList<Integer> getNumbers(){
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter a list of integers ending with 0: ");
        while(true){
            int number = input.nextInt();
            if (number != 0){
                list.add(number);
            }else {
                return list;
            }
        }
    }
    public static void shuffle(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            Integer integer1 = list.get(i);
            int random = (int)(list.size() * Math.random());

            Integer temp = list.get(random);
            list.set(random,integer1);
            list.set(i, temp);
        }
    }
    public static void displayArray(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
            if ((i + 1) % 10 == 0){
                System.out.println();
            }
        }
        System.out.println();
    }
}
