package week_12_exceptionHandling.assignments.exercise_12_16;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question_12_16 {
    public static void main(String[] args) throws IOException {
        if (args.length != 3){
            System.out.println("Usage: java ReplaceText sourceFile targetFile oldStr" +
           " newStr ");
            System.exit(1);
        }
        File file = new File(args[0]);
        if (!file.exists()){
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }
        Scanner input = new Scanner(file);
        File file2 = new File("modifiedFile.txt");
        PrintWriter output = new PrintWriter(file2);

        while(input.hasNext()){
            String str = input.nextLine();
            String modifiedString = str.replaceAll(args[1],args[2]);
            output.println(modifiedString);
        }
        output.close();
        input.close();
        file2.renameTo(file);
    }
}
