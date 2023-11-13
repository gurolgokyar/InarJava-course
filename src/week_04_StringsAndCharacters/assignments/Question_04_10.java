package week_04_StringsAndCharacters.assignments;

import java.util.Scanner;

public class Question_04_10 {
    public static void main(String[] args) {
        String set1 =
                "1  3  5  7\n" +
                "9  11 13 15\n" +
                "17 19 21 23\n" +
                "25 27 29 31\n";
        String set2 =
                "2  3  6  7\n" +
                "10 11 14 15\n" +
                "18 19 21 13\n" +
                "26 27 30 31\n";
        String set3 =
                "4  5  6  7\n"+
                "12 13 14 15\n" +
                "20 21 22 23\n"+
                "28 29 30 31\n";
        String set4=
                "8  9  10  11\n"+
                "12 13 14 15\n"+
                "24 25 26 27\n"+
                "28 29 30 31\n";
        String set5 =
                "16 17 18 19\n"+
                "20 21 22 23\n"+
                "24 25 26 27\n"+
                "28 29 30 31\n";

        Scanner input = new Scanner(System.in);
        int birthday=0;
        System.out.println("Is your birthday in set1?");
        System.out.println(set1);
        System.out.print("Enter N for No and Y for Yes: ");
        String answer = input.next();
        if (answer.equals("Y")){
            birthday+=1;
        }
        System.out.println("Is your birthday in set2?");
        System.out.println(set2);
        System.out.print("Enter N for No and Y for Yes: ");
        answer = input.next();
        if (answer.equals("Y")) {
            birthday += 2;
        }
        System.out.println("Is your birthday in set3?");
        System.out.println(set3);
        System.out.print("Enter N for No and Y for Yes: ");
        answer = input.next();
        if (answer.equals("Y")) {
            birthday += 4;
        }
        System.out.println("Is your birthday in set4?");
        System.out.println(set4);
        System.out.print("Enter N for No and Y for Yes: ");
        answer = input.next();
        if (answer.equals("Y")) {
            birthday += 8;
        }
        System.out.println("Is your birthday in set5?");
        System.out.println(set5);
        System.out.print("Enter N for No and Y for Yes: ");
        answer = input.next();
        if (answer.equals("Y")) {
            birthday += 16;
        }
        System.out.println("Your birthday is " + birthday +" !");

    }


}
