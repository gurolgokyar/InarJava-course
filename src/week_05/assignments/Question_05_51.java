package week_05.assignments;

import java.util.Scanner;

public class Question_05_51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String line1 = input.nextLine();

        System.out.print("Enter the second string: ");
        String line2 = input.nextLine();

        String commonPrefix = "";
        for (int i = 0; i < line1.length() && i < line2.length(); i++) {
            char letterOfLine1 = line1.charAt(i);
            char letterOfLine2 = line2.charAt(i);

            if (i == 0 && letterOfLine1 != letterOfLine2){
                System.out.println(line1 + " and " + line2 + " have no common prefix");
                System.exit(1);
            }

            if (letterOfLine1 == letterOfLine2){
                commonPrefix += letterOfLine1;
            }
        }

        System.out.println("The common prefix is " + commonPrefix);
    }
}
