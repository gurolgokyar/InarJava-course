package week_14.assignments.Question_14_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_14_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers for ArrayList nums (enter -1 to stop):");
        ArrayList<Integer> list = new ArrayList<>();

        int number;
        do {
            number = input.nextInt();
            if (number != -1){
                 list.add(number);
            }
        }while (number != -1);

        ArrayList<Integer> modifiedList = moveZerosToEnd(list);
        System.out.println("ArrayList after moving zeros to the end: " + modifiedList);
    }

    public static ArrayList<Integer> moveZerosToEnd(ArrayList<Integer> list){
        int indexForInsert = 0;
        ArrayList<Integer> modifiedList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0){
                modifiedList.add(list.get(i));
            }else {
                modifiedList.add(indexForInsert++, list.get(i));
            }
        }
        return modifiedList;
    }
}
// 23 45 0 4 0 2 0 45
// 23 45 4 45 0 0
