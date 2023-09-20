package week_06.assignments;

import java.util.Scanner;

public class Question_06_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int answer = input.nextInt();

        System.out.println(answer + " is" + ((isPalindrome(answer)) ? " " : " not ") + "a palindrome");
    }

    public static boolean isPalindrome(int n){
        return (n == reverse(n));
    }

    public static int reverse(int n){
        String s ="" + n;
        String reverse ="";

        for (int i = 0; i<s.length(); i++){
            reverse = s.charAt(i) + reverse;
        }
        return Integer.parseInt(reverse);
    }
}
