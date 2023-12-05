package week_14.workingArea;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        System.out.println("LinkedList Elements:");
        for(int number : linkedList){
            System.out.println(number);
        }

        linkedList.addFirst(5);
        linkedList.removeLast();

        System.out.println("\nUpdated LinkedList Elements: ");
        linkedList.forEach(number -> System.out.println(number));
    }
}
