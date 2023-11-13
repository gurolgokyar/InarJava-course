package week_10_objectOrientedProgramind_2.exercise_10_25;

import java.util.Arrays;

public class Question_10_25 {
    public static void main(String[] args) {
        String str = "Java#inar#aca?demy";
        String[] array = split(str, "#?");

        System.out.println(Arrays.toString(array));
    }

    public static String[] split(String s, String s2) {
        String[] result = new String[s.length()];
        int counter = 0;
        String s3 = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isChInS2(s2, ch)) {
                if (!s3.equals("")) {
                    result[counter++] = s3;
                    s3 = "";
                }
                result[counter++] = ch + "";
            } else {
                s3 += ch;
            }
            if (i == s.length() -1 && !s3.equals("")){
                result[counter++] = s3;
            }
        }
        String[] lastResult = new String[counter];
        System.arraycopy(result, 0, lastResult, 0, counter);
        return lastResult;

    }

    public static boolean isChInS2(String s, char ch) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }
}
