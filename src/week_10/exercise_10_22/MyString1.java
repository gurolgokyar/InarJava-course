package week_10.exercise_10_22;

public class MyString1 {
    private String s;

    public MyString1(char[] chars) {
       s = String.valueOf(chars);
    }

    public char charAt(int index) {
        return s.charAt(index);
    }

    public int length() {
        return s.length();
    }

    public MyString1 subString(int begin, int end) {
        String s1 = s.substring(begin, end);
        return new MyString1(s1.toCharArray());
    }
    public MyString1 toLowerCase(){
        return new MyString1(s.toLowerCase().toCharArray());
    }
    public boolean equals(MyString1 myString1){
        if (myString1.length() != s.length()){
            return false;
        }
        for (int i = 0; i < myString1.length(); i++) {
            if (myString1.charAt(i) != s.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public MyString1 valueOf(int i){
        String s1 = String.valueOf(i);
        return new MyString1(s1.toCharArray());
    }
    public String toString(){
        return s;
    }
}
