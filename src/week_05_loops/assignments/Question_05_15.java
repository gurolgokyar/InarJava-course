package week_05_loops.assignments;

public class Question_05_15 {
    public static void main(String[] args) {

        final int CHARACTER_PER_LINE=10;
        char ch='!';
        int counter=1;

        while (ch<=(char)126){
            if (counter%CHARACTER_PER_LINE==0){
                System.out.println(ch);
            }else {
                System.out.print(ch + " ");
            }

            ch++;
            counter++;
        }

    }
}
