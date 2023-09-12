package week_05.assignments;

public class Question_05_03 {
    public static void main(String[] args) {

        final double POUNDS_PER_KILOGRAM = 2.2;

        System.out.printf("%-10s %10s\n","Kilometers","Pounds");

        for (int i=1;i<=199;i+=2){
            double pound = i*POUNDS_PER_KILOGRAM;

            System.out.printf("%-10d %10.1f\n",i,pound);
        }
    }

}
