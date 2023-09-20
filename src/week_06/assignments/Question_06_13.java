package week_06.assignments;

public class Question_06_13 {
    public static void main(String[] args) {
        System.out.printf("%-5s\t%s\n","i","m(i)");

        for (int i = 0; i < 16; i++){
            System.out.print("-");
        }
        System.out.println();

       for (int i = 1; i <= 20; i++){
           System.out.printf("%-5d\t%1.4f\n",i,sum(i));
       }
    }

    public static double sum(int n){
        double result = 0;
        for (int i = 1; i <= n; i++){
            result += i * 1.0 / (i + 1);
        }
        return result;
    }
}
