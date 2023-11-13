package week_07_singleDimensionalArrays.assignment;

import java.util.Scanner;

public class Question_07_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String answer = input.nextLine();

        System.out.println("The sorted form: " + sort(answer));
    }

    public static String sort(String str) {
        String str2 = str.toLowerCase();
        char[] ch = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            ch[i] = str2.charAt(i);
        }

        return convertAnCharArrayToString(sortCharArray(ch));
    }

    public static char[] sortCharArray(char[] ch) {
        for (int i = 0; i < ch.length - 1; i++) {
            char min = ch[i];
            int indexOfMin = i;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[j] < min) {
                    min = ch[j];
                    indexOfMin = j;
                }
            }
            if (indexOfMin != i) {
                ch[indexOfMin] = ch[i];
                ch[i] = min;
            }
        }
        return ch;
    }

    public static String convertAnCharArrayToString(char[] ch) {
        String answer = "";
        for (char v : ch) {
            answer += v;
        }
        return answer;
    }
}
