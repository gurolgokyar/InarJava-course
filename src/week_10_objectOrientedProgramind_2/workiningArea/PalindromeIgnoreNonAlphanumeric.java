package week_10_objectOrientedProgramind_2.workiningArea;

import java.util.Scanner;

public class PalindromeIgnoreNonAlphanumeric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = input.nextLine();
        System.out.println("The string you entered is " + (isPalindrome(s) ? "" : "not ") + "palindrome");
    }

    public static boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                stringBuilder.append(s.charAt(i));
            }
        }
        String s1 = stringBuilder.toString();
        return s1.equals(stringBuilder.reverse().toString());
    }
}
