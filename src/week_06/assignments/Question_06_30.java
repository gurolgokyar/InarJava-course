package week_06.assignments;

public class Question_06_30 {
    public static void main(String[] args) {
        printCraps();
    }
    public static void printCraps(){
        int dice1 = (int)(Math.random()*6) + 1;
        int dice2 = (int)(Math.random()*6) + 1;

        int sum = dice1 + dice2;
        System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);

        if (sum == 2 || sum == 3 || sum == 12){
            System.out.println("You lose!");
        } else if (sum == 7 || sum == 11) {
            System.out.println("You win");
        }else {
           printWinner(sum);
        }
    }
    public static void printWinner(int sum){
        System.out.println("Point is " + sum);
        int dice1;
        int dice2;

        while(true){
            dice1 = (int)(Math.random()*6) + 1;
            dice2 = (int)(Math.random()*6) + 1;
            int point = dice1 + dice2;
            if (point == sum){
                System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2));
                System.out.println("You win");
                break;
            } else if (point == 7) {
                System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2));
                System.out.println("You lose");
                break;
            }else {
                System.out.println("You rolled " + point);
            }
        }
    }

}
