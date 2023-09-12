package week_05.assignments;

import java.util.Scanner;

public class Question_05_44 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        String bits=Integer.toBinaryString(input.nextInt());

        int length=bits.length();
        for (int i =length;i<16;i++){
            bits=0+bits;
        }
        System.out.println("The bits are "+ bits);
    }
}
