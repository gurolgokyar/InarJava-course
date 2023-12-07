package week_14.assignments.Question_14_08;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class MyStack<E> {
    private Queue<E> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }

    public void push(E element) {
        queue.offer(element);
    }

    public E pop() throws NoSuchElementException {
        if (queue.isEmpty()) {
            throw new NoSuchElementException("The stack is empty");
        }

        //You can use ((LinkedList<E>)queue).removeLast();

        Queue<E> queue1 = new LinkedList<>();
        while (queue.size() > 1) {
            queue1.offer(queue.remove());
        }

        E elementToPop = queue.remove();

        queue = new LinkedList<>(queue1);
        queue1 = null;

       return elementToPop;
    }

    public E top() throws NoSuchElementException {
        if (queue.isEmpty()) {
            throw new NoSuchElementException("The stack is empty");
        }

        E elementToTop = queue.peek();
        for (E e: queue) {
            elementToTop = e;
        }

        return elementToTop;
    }

    public boolean empty() {
        return queue.size() == 0;
    }

    public String toString() {
        String result = "";
        for (E e : queue) {
            result += e + " ";
        }
        return result;
    }
}
