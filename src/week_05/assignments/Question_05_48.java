package week_05.assignments;

import java.util.Scanner;

public class Question_05_48 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a string: ");
        String answer=input.nextLine();

        String output="";
        for (int i=0;i<answer.length();i++){
            if (i%2==0){
                output+=answer.charAt(i);
            }
        }
        System.out.println(output);
    }
}
