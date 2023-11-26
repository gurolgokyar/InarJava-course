package week_12_exceptionHandling.assignments.exercise_12_29;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Question_12_29 {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter a file name: ");
        File file =
                new File("C:\\Users\\user\\OneDrive\\Masaüstü\\WorkSpace\\InarAcademy_Java_course\\src" +
                        "\\week_12_exceptionHandling\\assignments\\exercise_12_29\\" + new Scanner(System.in).next());

        int[] occurrence = new int['z' - 'a'];
        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                String str = input.nextLine().toUpperCase();
                for (int i = 0; i < str.length(); i++) {
                    if (!Character.isLetter(str.charAt(i))){
                        continue;
                    }
                    occurrence[str.charAt(i) - 'a']++;
                }
            }
        }
        displayOccurrence(occurrence);
    }

    public static void displayOccurrence(int[] occurrence){
        for (int i = 0; i < occurrence.length; i++) {
            System.out.println("Number of " + ('A' + i) + "'s : " + occurrence[i]);
        }
    }
}
