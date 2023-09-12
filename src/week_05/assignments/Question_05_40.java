package week_05.assignments;

public class Question_05_40 {
    public static void main(String[] args) {

        int heads=0;
        int tails=0;
        for (int i=0; i<1000000;i++){
            int headOrTail=(int)(Math.random()*2);

            if (headOrTail==0){
                heads++;
            }else {
                tails++;
            }
        }

        System.out.println("Flipping a coin one million times..\n" +
                "  Heads: " + heads +
                "\n  Tails: " +tails);
    }

}
