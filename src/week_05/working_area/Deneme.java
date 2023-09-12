package week_05.working_area;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String answer=input.nextLine();

        String output="";

        for (int i= 0;i<answer.length();i++){
            if (Character.isDigit(answer.charAt(i)) && !Character.isDigit(answer.charAt(i+1))){

                int valueOfCharacter=Integer.parseInt(answer.charAt(i) +"");
                for (int j=1;j<=valueOfCharacter;j++){
                    output+=answer.charAt(i);
                }
            }
        }
        System.out.println(output);
    }
}
