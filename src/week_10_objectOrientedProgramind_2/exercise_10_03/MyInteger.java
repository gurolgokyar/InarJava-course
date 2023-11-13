package week_10_objectOrientedProgramind_2.exercise_10_03;

public class MyInteger {
    private int value;

    public MyInteger(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
    public static boolean isEven(int i){
        return i % 2 == 0;
    }
    public static boolean isOdd(int i){
        return i % 2 != 0;
    }
    public static boolean isPrime(int i){
        if (i < 2){
            return false;
        }
        for (int divisor = 2; divisor <= i / 2; divisor++) {
            if (i % divisor == 0){
                return false;
            }
        }
        return true;
    }
    public  boolean isEven(){
        return isEven(value);
    }
    public boolean isOdd(){
        return isOdd(value);
    }
    public boolean isPrime(){
        return isPrime(value);
    }
    public static boolean isEven(MyInteger integer){
       return isEven(integer.value);
    }
    public static boolean isOdd(MyInteger integer){
        return isOdd(integer.value);
    }
    public static boolean isPrime(MyInteger integer){
        return isPrime(integer.value);
    }
    public boolean Equals(int i){
        return value == i;
    }
    public boolean Equals(MyInteger integer){
        return Equals(integer.value);
    }
    public static int[] parsInt(char[] ch){
        int[] array = new int[ch.length];
        for (int i = 0; i < ch.length; i++) {
            array[i] = ch[i] - '0';
        }
        return array;
    }
    public static  int parsInt(String s){
        return Integer.parseInt(s);
    }
}
