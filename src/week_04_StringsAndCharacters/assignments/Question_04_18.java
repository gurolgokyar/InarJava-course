package week_04_StringsAndCharacters.assignments;

import java.util.Scanner;

public class Question_04_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String answer = input.nextLine();
        char major= answer.charAt(0);
        char status = answer.charAt(1);

        if (answer.length()!=2 || (major!='M'&& major!='C'&& major!='I')||(status<'1'||status>'4')){
            System.out.println("Incorrect input!");
            System.exit(1);
        }
        String major1 = switch (major) {
            case 'M' -> "Mathematics";
            case 'C' -> "Computer Science";
            case 'I' -> "Information technology";
            default -> "";
        };
        String studentStatus=switch (status){
            case '1'->"Freshman";
            case '2'->"Sophomore";
            case '3'->"Junior";
            case '4'->"Senior";
            default -> "";
        };
        //Display the results
        System.out.println(major1 + " " + studentStatus);

    }
}
