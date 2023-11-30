package week_12_exceptionHandling.assignments.exercise_12_27;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Question_12_27 {
    public static void main(String[] args) throws IOException {
//        File directory = new File("src/week_12_exceptionHandling/assignments/exercise_12_27/directory");
//        directory.mkdir();
//
//        for (int i = 1; i <= 15; i++) {
//            for (int j = 1; j <= 15; j++) {
//                PrintWriter file = new PrintWriter("src/week_12_exceptionHandling/assignments/exercise_12_27" +
//                        "/directory/Question" + i + "_" + j);
//            }
//        }
        if (args.length != 1) {
            System.out.println("Invalid format. The format is -> DirectoryName");
            System.exit(1);
        }

        File directory = new File(args[0]);
        File[] files = directory.listFiles();

        for (int i = 0; i < files.length; i++) {
            StringBuilder fileName = new StringBuilder(files[i].getName());
            String fileName1 = files[i].getName();
            if (fileName1.matches("Question\\d_.*")) {
                fileName.insert(8, 0);
            }
            File newFile = new File(files[i].getParent() + "/" + fileName);
            files[i].renameTo(newFile);
        }
    }
}
