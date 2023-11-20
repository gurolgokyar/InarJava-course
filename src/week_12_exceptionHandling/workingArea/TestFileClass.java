package week_12_exceptionHandling.workingArea;

import java.io.File;

public class TestFileClass {
    public static void main(String[] args) {
        File file = new File("src/week_12_exceptionHandling/workingArea/abc.txt");
        System.out.println("Does is exist? " + file.exists());
        System.out.println("The file has " + file.length() + " bytes");
    }
}
