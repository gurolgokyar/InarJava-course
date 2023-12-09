package week_14.assignments.Question_14_21;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class question_14_21 {
    public static void main(String[] args) {

        System.out.print("Enter the first list: ");
        ArrayList<Integer> list1= getList();

        System.out.print("Enter the second list: ");
        ArrayList<Integer> list2 = getList();

        ArrayList<Integer> intersectingNumbers = getIntersectingNumbers(list1, list2);
        System.out.println(intersectingNumbers.isEmpty() ? "There is not any intersecting number." :
                "Intersection of the two lists: " + intersectingNumbers);

    }

    public static ArrayList<Integer> getList(){
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list.add(input.nextInt());
        }

        return list;
    }

    public static ArrayList<Integer> getIntersectingNumbers(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < Math.min(list1.size(), list2.size()); i++) {
            if (list1.contains(list2.get(i))){
                result.add(list2.get(i));
            }
        }
        Collections.sort(result);
        return result;
    }
}
