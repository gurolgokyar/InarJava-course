package week_11_inheritanceAndPolymorphism.assignments.exercise_11_10;

import java.util.Scanner;

public class Question_11_10 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter five strings:");
        for (int i = 0; i < 5; i++) {
            myStack.add(String.valueOf(input.nextLine()));
        }

        System.out.println(myStack);
        System.out.println("Displaying them in reverse order:\n" + myStack.revers());

    }
}
