package week_04.live_class;

import java.util.Scanner;

public class CommonMathematicalFunctions {
    public static void main(String[] args) {

//        System.out.println("e power 1 ="+Math.exp(1));
//        System.out.println("log(e)="+Math.log(e) );
//        System.out.println("In Math.ceil 3.2 -> "+ Math.ceil(3.2));
//        System.out.println("In Math.ceil -3.2-> "+ Math.ceil(-3.2));
//        System.out.println("In Math.floor() 3.2-> " + Math.floor(3.2));
//        System.out.println("In Math.floor() -3.2-> " + Math.floor(-3.2));
//        System.out.println("In Math.round() 3.2-> " + Math.round(3.2));
//        System.out.println("In Math.round() 3.555-> " + Math.round(3.555));
//        System.out.println("In Math.round() -3.2-> " + Math.round(-3.2));
//        System.out.println("In Math.rint() 3.2-> " + Math.rint(3.2));
//        System.out.println("In Math.rint() 3.555-> " + Math.rint(3.555));
//        System.out.println("In Math.rint() 3.5-> " + Math.rint(3.5));
//        System.out.println("In Math.rint() -3.555-> " + Math.rint(-3.555));
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three points:");
        double gym1= input.nextDouble();
        double gym2=input.nextDouble();
        double num3= input.nextDouble();

        double gym1Distance=Math. abs(gym1);
        double gym2Distance=Math.abs(gym1);
        double gym3Distance=Math.abs(gym1);

        double nearestGym = Math.min(gym1Distance,Math.min(gym2Distance,gym3Distance));

        if (nearestGym==gym1Distance){
            System.out.printf("The nearest gym to your house is %f",nearestGym );
        } else if (nearestGym==gym2Distance) {
            System.out.printf("The nearest gym to your house is %f",nearestGym );
        }else {
            System.out.printf("The nearest gym to your house is %f",nearestGym );
        }

    }
}

