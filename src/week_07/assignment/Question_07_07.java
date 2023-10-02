package week_07.assignment;

public class Question_07_07 {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        for (int i = 0; i < 100; i++) {
            numbers[i] = (int)(Math.random() * 10);
        }
        int[] numberOfIntegers = getNumberOfIntegers(numbers);

        //display the result
        printNumberOfIntegers(numberOfIntegers);
    }

    public static int[] getNumberOfIntegers(int[] numbers) {
        int[] result = new int[10];
        for (int i = 0; i < 100; i++) {
            result[numbers[i]]++;
        }
        return result;
    }
    public static void printNumberOfIntegers(int[] array){
        System.out.println("Count for each number between 0 and 9:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + "s: " + array[i]);
        }
    }
}
