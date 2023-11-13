package week_05_loops.assignments;

import java.util.Scanner;

public class Question_05_01 {
    public static void main(String[] args) {

        int numberOfPositives=0;
        int numberOfNegatives=0;
        int total=0;
        int answer;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter an integer, the input ands if it is 0: ");
        do {
             answer= input.nextInt();
            if (answer>0){
                numberOfPositives++;
            }if (answer<0){
                numberOfNegatives++;
            }
            total+=answer;
        }while (answer!=0);

        //Find the average of inputs
        if (numberOfNegatives+numberOfPositives==0){
            System.out.println("No numbers are entered except 0");
            System.exit(1);
        }

        double average = (total*1.0)/(numberOfNegatives+numberOfPositives);

        System.out.println("The number of positives is " + numberOfPositives);
        System.out.println("The number of negative " + numberOfNegatives);
        System.out.println("The total is " + total);
        System.out.println("the average is " + average);
    }
}
