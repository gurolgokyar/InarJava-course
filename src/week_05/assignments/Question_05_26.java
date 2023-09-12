package week_05.assignments;

public class Question_05_26 {
    public static void main(String[] args) {
        double e=1;
        for (int i=1;i<=100000;i++){
            double factorial=1;
            for (int j=1;j<=i;j++){
                factorial*=1.0/j;
            }
            e+=factorial;

            if (i==10000){
                System.out.println("e at i=10000 is " + e);
            }
            if (i==20000){
                System.out.println("e at i=20000 is " + e);
            }
            if (i==100000){
                System.out.println("e at i=100000 is " + e);
            }
        }

        System.out.println("Java's e is "+Math.exp(1));

    }
}
