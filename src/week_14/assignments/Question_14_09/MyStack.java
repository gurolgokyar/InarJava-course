package week_14.assignments.Question_14_09;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class MyStack<E> {
    Deque<E> stack;

    public MyStack(){
        stack = new LinkedList<>();
    }

    public void push(E e){
        stack.add(e);
    }

    public E pop(){
        if (stack.size() == 0){
            throw new RuntimeException("Stack is empty");
        }
        //((LinkedList<>)stack).removeFirst;

        Deque<E> stack2 = new LinkedList<>();
        while(stack.size()> 1){
            stack2.offer(stack.removeLast());
        }

        E elementToPop = stack.remove();
        stack = new LinkedList<>(stack2);
        stack2 = null;

        return elementToPop;
    }

    public E peek(){
        if (stack.size() == 0){
            throw new RuntimeException("Stack is empty");
        }
        return stack.getLast();
    }

    public boolean empty(){
        return stack.size() == 0;
    }

    public String toString(){
        String result = "";

        for(E e : stack){
            result += e + " ";
        }

        return result;
    }



}
