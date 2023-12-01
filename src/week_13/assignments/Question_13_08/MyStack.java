package week_13.assignments.Question_13_08;

import java.util.ArrayList;

public class MyStack implements Cloneable {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.isEmpty() ? null : list.get(getSize() - 1);
    }

    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    public Object clone() throws CloneNotSupportedException{
        MyStack clonedStack = (MyStack) super.clone();
        clonedStack.list = (ArrayList<Object>) list.clone();
        return clonedStack;
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}
