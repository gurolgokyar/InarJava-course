package Week_03.assignments;


import java.util.Scanner;

public class Question_03_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight of the package (in pounds):");
        double weightOfPackage = input.nextDouble();

        //Find cost of shipping
        double cost = 0;
        if (0 < weightOfPackage && weightOfPackage <= 1)
            cost = weightOfPackage * 3.5;
        else if (1 < weightOfPackage && weightOfPackage <= 3)
            cost = weightOfPackage * 5.5;
        else if (3 < weightOfPackage && weightOfPackage <= 10)
            cost = weightOfPackage * 8.5;
        else if (10 < weightOfPackage && weightOfPackage <= 20)
            cost = weightOfPackage * 10.5;
        else {
            System.out.println("The package can not be shipped.");
            System.exit(1);
        }

        //Display the results
        System.out.println("Shipping cost of package is $" + cost);
    }
}
