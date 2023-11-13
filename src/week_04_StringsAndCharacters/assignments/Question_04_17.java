package week_04_StringsAndCharacters.assignments;

import java.util.Scanner;

public class Question_04_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.print("Enter a mount: ");
        String mount = input.next();

        int numberOfDays = 0;
        if (mount.equals("Jan") || mount.equals("Mar") || mount.equals("May") || mount.equals("Jul")
                || mount.equals("Oug") || mount.equals("Oct") || mount.equals("Dec")) {
            numberOfDays = 31;
        } else if (mount.equals("Fab")) {
            if (year % 4 == 0 && year % 100 != 0 && year % 400 == 0) {
                numberOfDays = 29;
            } else {
                numberOfDays = 28;
            }
        } else if (mount.equals("Apr") || mount.equals("Jun") || mount.equals("Sep") || mount.equals("Nov")) {
            numberOfDays = 30;
        }else {
            System.out.println("Incorrect input!");
            System.exit(1);
        }

        System.out.println(mount + " " + year + " has " + numberOfDays + " days.");
    }
}
