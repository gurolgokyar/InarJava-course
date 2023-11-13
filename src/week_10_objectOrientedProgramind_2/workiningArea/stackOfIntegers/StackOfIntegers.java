package week_10_objectOrientedProgramind_2.workiningArea.stackOfIntegers;

public class StackOfIntegers {
    private int[] elements;
    private int size;

    public StackOfIntegers() {
        this(16);
    }

    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }

    public boolean empty() {
        return size == 0;
    }

    public int peek() {
        return elements[size - 1];
    }

    public void push(int value) {
        elements[size++] = value;
        if (size == elements.length) {
            int[] temp = new int[size * 2];
            System.arraycopy(elements, 0, temp, 0, size);
            elements = temp;
        }
    }

    public int pop() {
        return elements[--size];
    }

    public int[] getElements() {
        return elements;
    }
    public int getSize(){
        return size;
    }
}
