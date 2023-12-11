package week_14.workingArea;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class TestClass2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);
        System.out.println("peek---> " + queue.peek());
        System.out.println("remove----> " + queue.remove());

        System.out.println("--------------\n");
        Deque<Integer> deque = new LinkedList<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);
        System.out.println(deque);
        System.out.println("peek --> " + deque.peek());
        System.out.println("peekLast---> " + deque.peekLast());
        System.out.println("remove----> " + deque.remove());

        //queue --> add(E e) --remove() --remove(Object o)--peek()--offer(Object o) -- isEmpty()-- contains(Object o)
        //deque --> add(E e) --push(E e) -- size()--remove()--remove(E e) --
    }
}
