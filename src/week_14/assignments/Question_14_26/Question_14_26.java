package week_14.assignments.Question_14_26;

import java.util.LinkedList;
import java.util.Random;

public class Question_14_26 {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            linkedList.add(random.nextInt(100));
        }

        System.out.println(linkedList.size());
        System.out.println("Original Linked List: " + linkedList);
        updateList(linkedList);
        System.out.println("Updated Linked List: " + linkedList);
    }

    public static void updateList(LinkedList<Integer> list) {

        for (int i = 0; i < list.size() - 1; i += 2) {
            list.add(i + 1, getGcd(list.get(i), list.get(i + 1)));
        }
    }

    public static int getGcd(int number1, int number2) {

        int gcd = 1;
        int possibleGcd;

        for (possibleGcd = 2; possibleGcd < Math.min(number1, number2); possibleGcd++) {
            if (number1 % possibleGcd == 0 && number2 % possibleGcd == 0) {
                gcd = possibleGcd;
            }
        }

        return gcd;
    }
}
