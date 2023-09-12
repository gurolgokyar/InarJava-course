package week_05.assignments;

public class Question_05_27 {
    public static void main(String[] args) {
         final int LEAP_YEAR_PER_LINE=10;
         int count=0;

         for (int i=101;i<=2100;i++){
             if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
                 count++;
                 if (count%LEAP_YEAR_PER_LINE==0){
                     System.out.println(i);
                 }else{
                     System.out.print(i + " ");
                 }
             }
         }
        System.out.println("\n\nThe number of the leap year from 101 to 2100: " + count);
    }
}
