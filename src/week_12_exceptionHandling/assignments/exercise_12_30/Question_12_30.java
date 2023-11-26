package week_12_exceptionHandling.assignments.exercise_12_30;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Question_12_30 {
    public static void main(String[] args) throws IOException {
//        for (int i = 2001; i <= 2010; i++) {
//            PrintWriter file = new PrintWriter("src/week_12_exceptionHandling/assignments/exercise_12_30/babyNames/" +
//                    "babynameranking" + i + ".txt");
//        }
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        input.nextLine();

        System.out.print("Enter the gender: ");
        char gender = input.nextLine().charAt(0);

        System.out.print("Enter the name: ");
        String name = input.nextLine();

        File file =
                new File("src/week_12_exceptionHandling/assignments/exercise_12_30/babyNames/babynameranking" + year + ".txt");
        try (
                Scanner input1 = new Scanner(file);
        ) {
            int rank = 1;
            while (input1.hasNext()){
                String str = input1.nextLine();
                String[] line = str.split(" ");
                int nameInLine = (gender == 'M' ? 1 : 3);
                if (line[nameInLine].compareTo(name) == 0){
                    System.out.println(name + " is ranked #" + rank + " in year " + year);
                    break;
                }
                rank++;
            }
        }
    }
}
