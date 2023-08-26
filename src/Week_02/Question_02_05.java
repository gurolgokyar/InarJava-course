package week_02;
import java.util.Scanner;
public class Question_02_05 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal and gratuity rate : ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        double gratuity = subtotal * gratuityRate/100;
        double total = gratuity + subtotal;

        System.out.println ("The gratuity is " + gratuity + " and total is $" + total );


    }
}
