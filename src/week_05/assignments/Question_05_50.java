package week_05.assignments;

import java.util.Scanner;

public class Question_05_50 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Enter a string: ");
        String answer=input.nextLine();

        int numberOfUppercase=0;

        for (int i = 0; i < answer.length(); i++){
            if (answer.charAt(i) >= 'A' && answer.charAt(i) <= 'Z'){
               numberOfUppercase++;
            }
        }
        System.out.println("The number of uppercase letter is " + numberOfUppercase);
    }
}
