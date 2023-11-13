package week_03_selections;


public class Question_03_24 {
    public static void main(String[] args) {

        //Generate two random integer for rank and suit
        int suit = (int) (Math.random() * 4);
        int rank = (int) (Math.random() * 13);

        String rankCart = switch (rank) {
            case 0 -> "Ace";
            case 1 -> "2";
            case 2 -> "3";
            case 3 -> "4";
            case 4 -> "5";
            case 5 -> "6";
            case 6 -> "7";
            case 7 -> "8";
            case 8 -> "9";
            case 9 -> "10";
            case 10 -> "Jack";
            case 11 -> "Queen";
            case 12 -> "King";
            default -> "";
        };
        String suitCart = switch (suit) {
            case 0 -> "Clubs";
            case 1 -> "Diamonds";
            case 2 -> "Hearts";
            case 3 -> "Spades";
            default -> "";
        };

        //Display the results
        System.out.println("The card you picked is " + rankCart + " of " + suitCart);

    }


}
