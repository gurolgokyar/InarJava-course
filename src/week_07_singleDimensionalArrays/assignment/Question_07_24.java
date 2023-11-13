package week_07_singleDimensionalArrays.assignment;

public class Question_07_24 {
    public static void main(String[] args) {
        String[] suits = {"Spade","Clubs","Diamonds","Hearts"};
        String[] rank = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

        int[] deck = new int[52];
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        shuffleTheDeck(deck);
       int numberOfPick = getNumberOfPick(deck,suits,rank);
        System.out.println("Number of picks: " + numberOfPick);
    }
    public static void shuffleTheDeck(int[] deck){
        for (int i = 0; i < deck.length; i++) {
            int number = (int)(Math.random()*deck.length);
            int temp = deck[i];
            deck[i] = deck[number];
            deck[number] = temp;
        }
    }

    public static int getNumberOfPick(int[] deck,String[] suit,String[] rank){
        String[] pickedSuits = new String[4];
        int numberOfPickedCart = 0;
        int numberOfPickedSuit = 0;
        while(numberOfPickedSuit < 4) {
            int pickedCart = deck[(int) (Math.random() * deck.length)];

            String suitInString = suit[pickedCart / 13];

            String rankInString = rank[pickedCart % 13];

            //Display the picked cart
            System.out.println(rankInString + " of " + suitInString);

            if (!isPicked(pickedSuits, suitInString)) {
                pickedSuits[numberOfPickedSuit] = suitInString;
                numberOfPickedCart++;
                numberOfPickedSuit++;
            } else {
                numberOfPickedCart++;
            }
        }
        return numberOfPickedCart;
    }
    public static boolean isPicked(String[] pickedSuits,String pickedSuit){
        for (int i = 0; i < pickedSuits.length; i++) {
            if (pickedSuit.equals(pickedSuits[i])){
                return true;
            }
        }
        return false;
    }
}
