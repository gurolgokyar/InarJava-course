package week_14.workingArea;

import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();
        stack.push("Element 1");
        stack.push("Element 2");
        stack.push("Element 3");
        System.out.println(stack);
        System.out.println(stack.peek());


//        LinkedList<Integer> linkedList1 = new LinkedList<>();
//        linkedList1.add(1);
//        linkedList1.add(2);
//        linkedList1.add(3);
//        System.out.println("Linkedlist(add) -->" + linkedList1);
//        System.out.println("Peek --> " + linkedList1.peek());
//        System.out.println("Remove --> " + linkedList1.remove());
//        System.out.println("Contains --> " + linkedList1.contains(2));

        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println("Push " + linkedList);
        System.out.println("Peek --> " +linkedList.peek());
        System.out.println("Remove --> " +linkedList.remove());
        //System.out.println("Get --> " + linkedList.get(0));
        System.out.println("Poll --> " + linkedList.poll());

        System.out.println("-----------------------------------------");
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");
        Stack<Integer> stack2 = new Stack<>();
        stack2.add(1);
        stack2.add(2);
        stack2.add(3);

        System.out.println("Stack -->" + stack2);
        System.out.println(stack2.peek());
       // System.out.println(stack2.get(0));
        System.out.println(stack2.contains(4));
        //System.out.println(stack2.remove(0));
       // int rem = stack2.remove(0);
        int pop = stack2.pop();
       // System.out.println("i ---> " + rem);
        System.out.println(stack2);



        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        System.out.println(stack1);
        System.out.println(stack1.peek());
        System.out.println(stack1.remove(2));

        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Arraylist" + list);
        list.remove(0);


    }
}
