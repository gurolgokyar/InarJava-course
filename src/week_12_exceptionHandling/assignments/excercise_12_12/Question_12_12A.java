package week_12_exceptionHandling.assignments.excercise_12_12;

import java.io.File;

public class Question_12_12A
{
    public static void main(String[] args)
    {
        File file = new File("src/week_12_exceptionHandling/assignments/excercise_12_12/Txt.txt");
        System.out.println(file.mkdir());
        //System.out.println(file.delete());
    }
}
