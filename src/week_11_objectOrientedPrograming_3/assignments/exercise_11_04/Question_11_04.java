package week_11_objectOrientedPrograming_3.assignments.exercise_11_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getNumbers();
        System.out.print("The largest number in the list is " +  max(list));
    }
    public static ArrayList<Integer> getNumbers(){
        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sequence of numbers ending with 0: ");
            while (true){
                int number = input.nextInt();
                if (number != 0){
                    list.add(number);
                }else {
                    return list;
                }
            }
    }

    public static Integer max(ArrayList<Integer> list){
       Integer maxNumber = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > maxNumber){
                maxNumber = list.get(i);
            }
        }
        return maxNumber;
    }
}
