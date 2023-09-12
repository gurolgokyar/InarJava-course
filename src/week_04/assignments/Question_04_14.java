package week_04.assignments;

import java.util.Scanner;

public class Question_04_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        String answer = input.nextLine();
        char ch = answer.charAt(0);

        if (answer.length()!=1||((ch<'A'||ch>'D')&&ch!='F')) {
            System.out.println(answer + " is an invalid grade!");
            System.exit(1);
        }
        int grade = 4;
        if (ch=='F'){
            grade = 0;
        }else {
            grade -=(ch-'A');
        }
        System.out.println("The numeric value for grade " +ch + " is " +grade);
    }
}
