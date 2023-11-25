package week_12_exceptionHandling.assignments.excercise_12_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question_12_11 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File(args[1]);
        if (!file.exists()){
            System.out.println( "File " + args[1] + " does not exist!");
            System.exit(1);
        }


        try (
                Scanner input = new Scanner(file);
                PrintWriter output = new PrintWriter(args[1] + "_02")
        ) {
            while(input.hasNext()){
                String str = input.nextLine();
                String str2 = str.replaceAll(args[0],"");
                output.println(str2);
            }
        }
        File modifiedFile = new File(args[1] + "_02");
        try (
                Scanner input = new Scanner(modifiedFile);
                PrintWriter output = new PrintWriter(file);
        ) {
            while (input.hasNext()) {
                output.println(input.nextLine());
            }
        }
        modifiedFile.delete();


    }
}
