package week_12_exceptionHandling.assignments.excercise_12_08;

import java.util.Scanner;

public class Question_12_08 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String hexString = input.next().toUpperCase();
        try{
            System.out.println("The decimal value for hex number " + hexString + " is " + hex2Dec(hexString));
        }catch(HexFormatException ex){
            System.out.println(ex.toString());
        }
    }
    public static int hex2Dec(String hexString) throws HexFormatException {
        int sum = 0;
        for (int i = 0; i < hexString.length(); i++) {
            char ch = hexString.charAt(i);
            if (isHexDigit(ch)){
                sum = sum * 16 + getDicimalValue(ch);
            }else {
                throw new HexFormatException("It is not a hex string!");
            }
        }
        return sum;
    }
    public static boolean isHexDigit(char ch){
        return Character.isDigit(ch) || (ch >= 'A' && ch <= 'F');
    }

    public static int getDicimalValue(char ch){
        if (Character.isDigit(ch)){
            return ch - '0';
        }else{
            return 10 + ch - 'A';
        }
    }
}
