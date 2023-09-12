package week_05.assignments;

public class Question_05_06 {
    public static void main(String[] args) {

        System.out.printf("%-10s\t%-10s%s%-10s\t\t%-1s\n","Miles","Kilometers","   |   ","Kilometers","Miles");

        for (int mile=1,kilometer=20;mile<=10;mile++,kilometer+=5){
            double toKilometers=mile*1.609;
            double toMiles=kilometer/1.609;

            //Display the results
            System.out.printf("%-10d\t%-10.3f%s%-10d\t\t%-4.3f\n",mile,toKilometers,"   |   ",kilometer,toMiles);
        }
    }
}
