package week_14.workingArea;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Deque<String> queue = new LinkedList<>();
        queue.add("Customer 1");
        queue.add("Customer 2");
        queue.add("Customer 3");

        for (String c : queue){
            System.out.println(c);
        }

        String frontCustomer = queue.poll();
        System.out.println("\nFront Customer Dequeued: " + frontCustomer);

        System.out.println("\nUpdated Queue Elements:");
        for (String customer : queue) {
            System.out.println(customer);
        }
    }
}
