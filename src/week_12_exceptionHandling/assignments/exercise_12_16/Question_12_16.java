package week_12_exceptionHandling.assignments.exercise_12_16;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question_12_16 {
    public static void main(String[] args) throws IOException {
        if (args.length != 3){
            System.out.println("Usage: java ReplaceText sourceFile oldStr" +
           " newStr ");
            System.exit(1);
        }
        File file = new File(args[0]);
        if (!file.exists()){
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }
        Scanner input = new Scanner(file);
        File file1 = new File("modifiedFile.txt");
        PrintWriter output = new PrintWriter(file1);

        while(input.hasNext()){
            String str = input.nextLine();
            String modifiedString = str.replaceAll(args[1],args[2]);
            output.println(modifiedString);
        }
        output.close();
        input.close();

        Scanner input2 = new Scanner(file1);
        PrintWriter output2 = new PrintWriter(file);
        changeInContents(input2, output2);
        file1.delete();
    }

    public static void changeInContents(Scanner input, PrintWriter output) {
        while (input.hasNext()) {
            output.println(input.nextLine());
        }
        output.close();
        input.close();
    }
}
