package week_04.assignments;

public class Question_04_16 {
    public static void main(String[] args) {
        //Generate a random number can be  corresponding any uppercase
        int number = (int)(Math.random()*26)+'A';

        //Find the uppercase corresponding random number
        char uppercase= (char)number;

        System.out.println(uppercase);
    }
}
