package week_13.assignments.Question_13_08;

public class Question_13_08 {
    public static void main(String[] args) throws CloneNotSupportedException{
        MyStack myStack1 = new MyStack();
        myStack1.push(4);
        myStack1.push(5);
        myStack1.push(6);

        MyStack myStack2 = (MyStack) myStack1.clone();
        myStack2.pop();

        System.out.println("Pushing the number 4, 5, and 6 to 1st stack...");
        System.out.println("Cloning 1st stack");
        System.out.println("Popping object from 1st stack...");
        System.out.println("1st  " + myStack1);
        System.out.println("2nd  " + myStack2);
        System.out.println("Is the 1st stack equal to the 2nd stack? --> " + (myStack1 == myStack2));

    }
}
