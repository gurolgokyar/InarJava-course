package week_06_methods.assignments;

import java.util.Scanner;

public class Question_06_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = input.nextLine();

        System.out.println((isValidPassword(password)) ? "Valid password" : "Invalid password");
    }

    public static boolean isValidPassword(String password){
        int numberOfDigit=0;

        for (int i = 0; i < password.length(); i++){
            char ch = password.charAt(i);
            if (!Character.isDigit(ch) && !Character.isLetter(ch)){
                return false;
            }
            if (Character.isDigit(ch)){
                numberOfDigit ++;
            }
        }
        return (numberOfDigit >= 2 && password.length() >= 8);
    }
}
