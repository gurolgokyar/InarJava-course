package week_10.exercise_10_24;

public class MyCharacter {
    private char ch;

    public MyCharacter(char ch) {
        this.ch = ch;
    }

    public char charValue() {
        return ch;
    }

    public static MyCharacter valueOf(char ch) {
        return new MyCharacter(ch);
    }

    public static int compare(char ch1, char ch2) {
        return ch1 - ch2;
    }

    public int compareTo(MyCharacter c) {
        return ch - c.charValue();
    }

    public boolean equals(MyCharacter c) {
        return compareTo(c) == 0;
    }

    public static boolean isLetter(char ch) {
        return ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z';
    }

    public static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean isDigitOrLetter(char ch) {
        return isDigit(ch) || isLetter(ch);
    }

    public static char toUpperCase(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return (char) (ch - 32);
        } else {
            return ch;
        }
    }

    public static char toLowerCase(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return (char) (ch + 32);
        } else {
            return ch;
        }
    }
    public static boolean isLowerCase(char ch){
        return ch >= 'a' && ch <= 'z';
    }
    public static boolean isUpperCase(char ch){
        return ch >= 'A' && ch <= 'Z';
    }
    public String toString(){
        return ch + ""; // you can do String.valueOf(c);
    }
}
