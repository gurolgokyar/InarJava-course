package week_10_objectOrientedProgramind_2.exercise_10_03;

public class TestMyIntegerClass {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(41614161);
        System.out.println("isEven(): " + myInteger.isEven());
        System.out.println("isOdd(): " + myInteger.isOdd());
        System.out.println("isPrime(): " + myInteger.isPrime());
        System.out.println("equals(10): " + myInteger.equals(10));
        System.out.println("equals(MyInteger(41614161): " + myInteger.Equals(41614161));
        System.out.println("isEven(41614161) static: " + MyInteger.isEven(41614161));
        System.out.println("isOdd(41614161) static: " + MyInteger.isOdd(41614161));
        System.out.println("isPrime(41614161) static: " + MyInteger.isPrime(41614161));
        System.out.print("parseInt(char[] {1,2,3}) static: ");
        char[] ch = {'1', '2', '3'};
        int[] array = MyInteger.parsInt(ch);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println("\nparInt(String 123) static: " + MyInteger.parsInt("123"));
    }
}
