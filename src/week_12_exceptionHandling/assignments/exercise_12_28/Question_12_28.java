package week_12_exceptionHandling.assignments.exercise_12_28;

import java.io.File;
import java.io.IOException;

public class Question_12_28 {
    public static void main(String[] args) throws IOException {
//        File directory = new File("src/week_12_exceptionHandling/assignments/exercise_12_28/directory");
//        directory.mkdir();
//        for (int i = 1; i <= 2; i++) {
//            for (int j = 1; j <= 15; j++) {
//                PrintWriter file =
//                        new PrintWriter("src/week_12_exceptionHandling/assignments/exercise_12_28/directory/Question" + i +
//                                "_" + j);
//
//            }
//        }
        if (args.length != 1) {
            System.out.println("Invalid format! Format: directoryName.");
            System.exit(1);
        }

        File file = new File(args[0]);
        File[] files = file.listFiles();

        for (int i = 0; i < files.length; i++) {
            StringBuilder fileName = new StringBuilder(files[i].getName());
            String fileName1 = files[i].getName();

            if (fileName1.matches("Question\\d_\\d")) {
                fileName.insert(10, 0);
            } else if (fileName1.matches("Question\\d{2}_\\d")) {
                fileName.insert(11, 0);
            }

            File newFile = new File(files[i].getParent() + "/" + fileName);
            files[i].renameTo(newFile);
        }


    }
}
