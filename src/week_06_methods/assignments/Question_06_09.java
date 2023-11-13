package week_06_methods.assignments;

public class Question_06_09 {
    public static void main(String[] args) {
        for (int i = 0; i<37; i++){
            System.out.print("-");
        }
        System.out.println();

        System.out.printf("%-6s\t%-6s\t|\t%-6s\t%-6s\n","Feet","Meters","Meters","Feet");

        for (int i = 1,j = 20;i<=10; i++,j +=5){
            System.out.printf("%-6d\t%-6.3f\t|\t%-6d\t%-6.3f\n",i,footToMeter(i),j,meterToFeet(j));
        }
    }

    public static double footToMeter(int f){
        return f * 0.305;
    }
    public static double meterToFeet(int m){
        return 3.279 * m;
    }
}
