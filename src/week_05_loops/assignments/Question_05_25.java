package week_05_loops.assignments;

public class Question_05_25 {
    public static void main(String[] args) {

        double pi=0;

        for (int i =1;i<=100000;i++){
            pi+=Math.pow(-1,i+1)/((2*i-1)*1.0);

            if (i==10000){
                System.out.println("PI value for i= 10000: " + (pi*4));
            }
            if (i==20000){
                System.out.println("PI value for i= 20000: " + (pi*4));
            }
            if (i==100000){
                System.out.println("PI value for i= 100000: " + (pi*4));
            }
        }
    }

}
