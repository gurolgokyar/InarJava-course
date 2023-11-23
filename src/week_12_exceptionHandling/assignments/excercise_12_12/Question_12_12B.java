package week_12_exceptionHandling.assignments.excercise_12_12;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question_12_12B {
    public static void main(String[] args) throws Exception{
        File file = new File("src/week_12_exceptionHandling/assignments/excercise_12_12/Question_12_12A.java");
        Scanner input = new Scanner(file);
        PrintWriter output = new PrintWriter("src/week_12_exceptionHandling/assignments/excercise_12_12" +
                "/Question_12_12C.java");

        while(input.hasNext()){
            String str = input.nextLine();
            String str2 = "";
            if (input.hasNext()){
                str2 = input.nextLine();
            }else {
                output.println(str);
            }
            if (str2.compareTo("{") == 0){
                output.println(str + str2);
            }else {
                output.println(str);
                output.println(str2);
            }
        }
        output.close();
        input.close();
        File file2 = new File("src/week_12_exceptionHandling/assignments/excercise_12_12" +
                "/Question_12_12C.java");
        file2.renameTo(file);
    }
}
