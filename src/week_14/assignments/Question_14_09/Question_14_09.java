package week_14.assignments.Question_14_09;

public class Question_14_09 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        System.out.println("MyStack --> " + myStack);
        System.out.println("Pop --> "  + myStack.pop());
        System.out.println("Empty --> " + myStack.empty());
        System.out.println("Peek --> " + myStack.peek());
    }
}
