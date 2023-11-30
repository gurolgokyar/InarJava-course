package week_12_exceptionHandling.assignments.exercise_12_26;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Question_12_26 {
    public static void main(String[] args) throws IOException {
//        File directory = new File("src/week_12_exceptionHandling/assignments/exercise_12_26/directory");
//        directory.mkdir();
//       // This section for generate files under the directory
//        for (int i = 1; i <= 20; i++) {
//            for (int j = 1; j <=  5; j++) {
//                File file =
//                        new File("src/week_12_exceptionHandling/assignments/exercise_12_26/directory/Question_" + i + "_" + j);
//                PrintWriter output = new PrintWriter(file);
//            }
//        }
        File directory = new File(args[0]);
        File[] files = directory.listFiles();

        for (int i = 0; i < files.length; i++) {
            StringBuilder fileName = new StringBuilder(files[i].getName());
            String fileName1 = files[i].getName();

            if (fileName1.matches("Question_\\d_\\d{2}")) {
                fileName.insert(9, 0);
            } else if (fileName1.matches("Question_\\d_\\d")) {
                fileName.insert(9, 0);
                fileName.insert(12, 0);
            } else if (fileName1.matches("Question_\\d{2}_\\d")) {
                fileName.insert(12, 0);
            }

            File newFile = new File(files[i].getParent() + "/" + fileName);
            files[i].renameTo(newFile);
        }

    }
}
