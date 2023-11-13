package week_06_methods.assignments;

public class Question_06_14 {
    public static void main(String[] args) {
        System.out.printf("%-3s\t\t%s\n","i","m(i)");

        System.out.println("---------------");

        for (int i = 1; i <= 901; i += 100){
            System.out.printf("%-3d\t\t%1.4f\n",i,findPi(i));
        }
    }

    public static double findPi(int n){
        double result = 0;
        for (int i = 1; i <= n; i++){
            result += Math.pow(-1, i + 1) / (2 * i - 1);
        }

        return 4 * result;
    }
}
