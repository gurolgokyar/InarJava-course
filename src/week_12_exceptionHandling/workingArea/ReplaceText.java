package week_12_exceptionHandling.workingArea;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 4) {
            System.out.println("The length is " + args.length);
            System.out.println("Usage: java ReplaceText sourceFile targetFile oldStr newStr");
            System.exit(1);
        }

        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }

        File targetFile = new File(args[1]);
        if (targetFile.exists()) {
            System.out.println("The target file " + args[1] + " is already exists");
            System.exit(3);
        }

        Scanner input = new Scanner(sourceFile);
        PrintWriter output = new PrintWriter(targetFile);

        while (input.hasNext()) {
            String str1 = input.nextLine();
            String str2 = str1.replaceAll(args[2], args[3]);
            output.println(str2);
        }
        output.close();
    }
}
