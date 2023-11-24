package week_11_inheritanceAndPolymorphism.assignments.exercise_11_17;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer m: ");
        int number = input.nextInt();

        ArrayList<Integer> factorsOfNumber = getFactors(number);
        int n = getN(factorsOfNumber);

        System.out.println("The smallest number n for m * n to be a perfect square is " + n);
        System.out.println("m * n is " + (number * n));
    }

    public static ArrayList<Integer> getFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<>();
        int possibleFactor = 2;
        while (number > 1) {
            if (number % possibleFactor == 0) {
                factors.add(possibleFactor);
                number /= possibleFactor;
            } else {
                possibleFactor++;
            }
        }
        return factors;
    }

    public static int getN(ArrayList<Integer> list) {
        ArrayList<Integer> factorOfN = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int counter = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).intValue() == list.get(j).intValue()) {
                    counter++;
                }
            }
            if (counter % 2 == 1 && !factorOfN.contains(list.get(i))) {
                factorOfN.add(list.get(i));
            }
        }
        return multiplyOfFactors(factorOfN);
    }

    public static int multiplyOfFactors(ArrayList<Integer> list) {
        int result = 1;
        for (int i = 0; i < list.size(); i++) {
            result *= list.get(i);
        }
        return result;
    }
}
