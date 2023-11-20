package week_12_exceptionHandling.workingArea;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteData {
    public static void main(String[] args) throws IOException {
        //java.io.File file = new java.io.File("scores.txt");
        File file = new File("src/week_12_exceptionHandling/workingArea/scores.txt");
//        if (file.exists()) {
//            System.out.println("File already exists");
//            System.exit(1);
//        }
        PrintWriter output = new PrintWriter(file);
        output.print("John              T Smith ");
        output.println("90");
        output.print("Eric K      jones ");
        output.println("   85    7    8 ");
        output.print("Gurol m GOkyar ");
        output.println("100");
        output.close();

        Scanner input = new Scanner(file);
        System.out.println(input.next());
        System.out.println("Does it exist? " + file.exists());
        System.out.println("The Þle has " + file.length() + " bytes");
        System.out.println("Can it read? " + file.canRead());
        System.out.println("Can it write? " + file.canWrite());
        System.out.println("Is it a directory? " + file.isDirectory());
        System.out.println("Is it a file? "+ file.isFile());
        System.out.println("Is it absolute? " + file.isAbsolute());
        System.out.println("Is it hidden? " + file.isHidden());
        System.out.println("The absolute path is " + file.getAbsolutePath());
        System.out.println("Last modified on " + new java.util.Date(file.lastModified()));

        System.out.println("---------------------------------------------");
        Scanner input1 = new Scanner(file);
        //input1.useDelimiter("[o i]");
        while (input1.hasNext()){
            System.out.print(input1.next());
        }
//        System.out.println(input1.next());
//        System.out.println(input1.nextLine());
        System.out.println(file.delete());
        System.out.println(file.renameTo(new File("MyFile.txt")));


    }
}
