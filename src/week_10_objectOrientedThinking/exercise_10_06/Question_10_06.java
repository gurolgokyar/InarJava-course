package week_10_objectOrientedThinking.exercise_10_06;

import week_10_objectOrientedThinking.exercise_10_03.MyInteger;
import week_10_objectOrientedThinking.workiningArea.stackOfIntegers.StackOfIntegers;

public class Question_10_06 {
    public static void main(String[] args) {
        StackOfIntegers stackOfIntegers = new StackOfIntegers();
        for (int i = 1; i < 120; i++) {
            if (MyInteger.isPrime(i)){
                stackOfIntegers.push(i);
            }
        }
        while (!stackOfIntegers.empty()){
            System.out.print(stackOfIntegers.pop() + " ");
        }
    }
}
