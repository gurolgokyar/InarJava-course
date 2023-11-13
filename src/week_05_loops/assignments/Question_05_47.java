package week_05_loops.assignments;

import java.util.Scanner;

public class Question_05_47 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String answer=input.nextLine();

        int sum=0;
        for (int i=0;i<answer.length();i++){
            if (!Character.isDigit(answer.charAt(i))){
                System.out.println(answer + "is an invalid input!");
                System.exit(1);
            }
            int digit=answer.charAt(i)-'0';

            if ((i+1)%2==0){
                sum+=digit*3;
            }else {
                sum+=digit;
            }
        }
        int digit13=10-sum%10;

        if (digit13==10){
            digit13=0;
        }

        System.out.println("The ISBN-13 number is " + answer + digit13);
    }
}
