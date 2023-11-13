package week_09_objectOrientedPrograming_1.listings_09;

public class TestRandomClass {
    public static void main(String[] args) {
        System.out.println(new java.util.Random().nextInt(10)); // This is very useful

        java.util.Random randomNumber1 = new java.util.Random();
        System.out.println(randomNumber1.nextInt());
        System.out.println(randomNumber1.nextInt(10));
        System.out.println(randomNumber1.nextLong());
        System.out.println(randomNumber1.nextDouble());

        java.util.Random randomNumber2 = new java.util.Random(-1);
        for (int i = 0; i < 40; i++) {
            System.out.print(randomNumber2.nextInt(100) + " ");
        }

        java.util.Random randomNumber3 = new java.util.Random(-1);
        System.out.println();
        for (int i = 0; i < 40; i++) {
            System.out.print(randomNumber3.nextInt(100) + " ");
        }

    }
}
