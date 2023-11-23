package week_12_exceptionHandling.assignments.exercise_12_19;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Question_12_19 {
    public static void main(String[] args)throws  IOException {
        URL url = new URL("https://en.wikipedia.org/wiki/The_Cranberries");
        Scanner input = new Scanner(url.openStream());
        int numberOfWords = 0;
        while(input.hasNext()){
           input.next();
            numberOfWords++;
        }
        input.close();

        System.out.println("The total word number is " + numberOfWords + " in " + url);
    }
}
