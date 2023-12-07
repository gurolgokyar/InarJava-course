package week_14.workingArea;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class TestClass {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Deque<Integer> deque = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();

        linkedList.removeLast();
        linkedList.addFirst(2);

        deque.removeLast();
        deque.addFirst(2);

        ((LinkedList) queue).addFirst(2);
        ((LinkedList) queue).removeLast();
    }
}
