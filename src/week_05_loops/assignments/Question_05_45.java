package week_05_loops.assignments;

import java.util.Scanner;

public class Question_05_45 {
    public static void main(String[] args) {
        double sum=0;
        double multiplication=0;

        Scanner input=new Scanner(System.in);
        System.out.print("Enter ten numbers: ");

        for (int i=1;i<=10;i++){
            double answer=input.nextDouble();
            sum+=answer;
            multiplication+=answer*answer;
        }

        //Find the mean and deviation
        double mean=sum/10;
        double deviation=Math.pow((multiplication-(sum*sum/10))/(9) , 0.5);

        System.out.println("The mean is " + mean);
        System.out.printf("The standard deviation is %6.5f", deviation);

    }
}
