package week_12_exceptionHandling.workingArea;

import java.util.Scanner;

public class TestClassOfScanner {
    public static void main(String[] args) {
        String linerSeparator = System.getProperty("line.separator");
        System.out.println(linerSeparator);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int i = input.nextInt();
        input.nextLine();
        System.out.println("Enter a string");
        String s = input.nextLine();
        System.out.println("hello " + s + i);

        System.out.println("-----------------------------\n");
        Scanner input1 = new Scanner("13  14");

        //int sum = input1.nextInt() + input1.nextInt();
        //you can use way below
        int number1 = input1.nextInt();
        int number2 = input1.nextInt();
        int sum = number1 + number2;
        System.out.println("The sum is --> " + sum);
        System.out.println("number1 : " + number1 + "\nnumber2 : " + number2);
    }
}
