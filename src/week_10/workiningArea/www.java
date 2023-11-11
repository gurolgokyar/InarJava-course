package week_10.workiningArea;

public class www {
    public static void main(String[] args) {
        for (int i = 2; i < 8388607; i++) {
            if (8388607 % i == 0){
                System.out.println(false);
                System.out.println(i);
                break;
            }
        }
        System.out.println(8388607%47);
    }
}
