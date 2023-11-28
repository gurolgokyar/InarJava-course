package week_12_exceptionHandling.assignments.exercise_12_22;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question_12_22 {
    public static void main(String[] args) throws IOException {
        if (args.length != 3) {
            System.out.println("The format is Directory oldString newString");
            System.exit(1);
        }

        File file = new File(args[0]);
        if (!file.isDirectory()) {
            System.out.println("The directory does not exist!");
            System.exit(2);
        }
        File[] files = file.listFiles();
        if (files.length == 0) {
            System.out.println("There is not any file in the directory");
            System.exit(3);
        }

        File fileModified = new File("fileModified.txt");
        String str;
        String modifiedStr;
        for (int i = 0; i < files.length; i++) {
            try (
                Scanner input = new Scanner(files[i]);
                PrintWriter output = new PrintWriter(fileModified);
            ) {
                while (input.hasNext()) {
                    str = input.nextLine();
                    modifiedStr = str.replaceAll(args[1], args[2]);
                    output.println(modifiedStr);
                }
            }
                changeContents(files[i], fileModified);
        }
        fileModified.delete();
    }

    public static void changeContents(File file, File fileModified) throws IOException {
        try (
                Scanner input = new Scanner(fileModified);
                PrintWriter output = new PrintWriter(file);
        ) {
            while (input.hasNext()) {
                output.println(input.nextLine());
            }
        }
    }
}
