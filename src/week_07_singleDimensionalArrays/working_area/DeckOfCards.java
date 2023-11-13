package week_07_singleDimensionalArrays.working_area;

public class DeckOfCards {
    public static void main(String[] args) {
        String[] suit = {"Spades","Hearts","Diamond","Clubs"};
        String[] rank = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

        //Generate the cart deck
        int[] deck = new int[52];
        for (int i = 0; i <52 ; i++) {
            deck[i] = i;
        }
        //Shuffle the deck
        for (int i = 0; i < 52; i++) {
            int j = (int)(Math.random() * 52);
            int temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
        //Take four carts
        for (int i = 0; i < 4; i++) {
            String cartSuit = suit[deck[i] / 13];
            String cartRank = rank[deck[i] % 13];

            System.out.println("Cart number " + (deck[i] + 1 )+ ": " + cartRank + " of " + cartSuit);
        }
    }
}
