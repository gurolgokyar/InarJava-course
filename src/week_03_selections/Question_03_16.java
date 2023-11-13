package week_03_selections;

public class Question_03_16 {
    public static void main(String[] args) {
        //Generate a coordinate randomly for (x ,y)
        int x = (int)(Math.random()*(50 + 50) - 50);
        int y = (int)(Math.random()*(100+100)-100);

        //display the results
        System.out.println("Random coordinate in rectangle centered at (0,0) " +
                "with width 100 and height 200 : (" + x + "," + y +")");

    }
}





