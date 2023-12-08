package week_14.workingArea;

import java.util.*;

public class TestClass {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        Deque<Integer> deque = new LinkedList<>();
//        Queue<Integer> queue = new LinkedList<>();
//
//        linkedList.removeLast();
//        linkedList.addFirst(2);
//
//        deque.removeLast();
//        deque.addFirst(2);
//
//        ((LinkedList) queue).addFirst(2);
 //       ((LinkedList) queue).removeLast();
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,3);
        map.put(2,4);
        map.put(1,2);
        map.replace(2,map.get(2) + 3);
        System.out.println(map.get(2));
        System.out.println(map.get(1));
    }
}
