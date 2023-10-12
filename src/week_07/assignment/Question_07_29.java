package week_07.assignment;

public class Question_07_29 {
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        int[] deck = getShuffledDeck();

        int[] pickedCarts = new int[4];
        int sum;
        int numberOfPickedCarts = 0;
        while (true) {

            for (int i = 0; i < pickedCarts.length; i++) {
                pickedCarts[i] = deck[i];
            }
            //Find sum of picked carts
            sum = getSum(pickedCarts);
            if (sum == 24){
                numberOfPickedCarts += 4;
                break;
            }
            else {
                deck = getShuffledDeck();
                java.util.Arrays.fill(pickedCarts,0);
                numberOfPickedCarts +=4;
            }
        }

        //display the picked carts whose sum is equal to 24
        displayPickedCarts(pickedCarts,numberOfPickedCarts);
    }

    public static int[] getShuffledDeck() {
        int[] deck = new int[52];
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        //Shuffle the deck
        for (int i = 0; i < deck.length; i++) {
            int cart = (int) (Math.random() * deck.length);

            int temp = deck[cart];
            deck[cart] = deck[i];
            deck[i] = temp;
        }
        return deck;
    }

    public static int getSum(int[] pickedCart) {
        int sum = 0;
        for (int v : pickedCart) {
            sum += v % 13 + 1;
        }
        return sum;
    }

    public static void displayPickedCarts(int[] pickedCarts, int numberOfPickedCarts){
        String[] suits = {"Spades", "Heart", "Diamonds", "Clubs"};
        String[] ranks = {"King", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen"};
        for (int i = 0; i < pickedCarts.length; i++) {
            System.out.println(ranks[pickedCarts[i] % 13] + " of " + suits[pickedCarts[i] / 13]);
        }
        System.out.println("You have " + numberOfPickedCarts + " times picked for reaching 24");
    }
}
