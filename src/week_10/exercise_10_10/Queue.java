package week_10.exercise_10_10;

public class Queue {
    private int[] elements;
    private int size;
    private final int DEFAULT_CAPACITY = 8;
    public Queue(){
        elements = new int[DEFAULT_CAPACITY];
    }
    public void enQueue(int v){
        if (size == elements.length){
            int[] temp = new int[size * 2];
            System.arraycopy(elements,0,temp,0,size - 1);
            elements = temp;
        }
        elements[size++] = v;
    }
    public void deQueue(){
        for (int i = 0; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int getSize(){
        return size;
    }
    public int[] getElements(){
        return elements;
    }
    public void disPlayTheElements(){
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
            if ((i + 1) % 10 == 0){
                System.out.println();
            }
        }
    }
}
