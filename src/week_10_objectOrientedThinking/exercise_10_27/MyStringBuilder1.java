package week_10_objectOrientedThinking.exercise_10_27;

public class MyStringBuilder1 {
    public String s;

    public MyStringBuilder1(String s) {
        this.s = s;
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
       this.s += s.toString();
       return this;
    }

    public MyStringBuilder1 append(int i) {
        s += i;
       return this;
    }

    public int length() {
        return s.length();
    }

    public char charAt(int index) {
        return s.charAt(index);
    }

    public MyStringBuilder1 toLowerCase() {
        //We should use s = s.toLowerCase() because if we don't write like this s can not change
        s = s.toLowerCase();
        return new MyStringBuilder1(s.toLowerCase());
    }

    public MyStringBuilder1 substring(int begin, int end) {
        String s1 = "";
        for (int i = begin; i < end; i++) {
            s1 += s.charAt(i);
        }
        return new MyStringBuilder1(s1);
    }

    public String toString() {
        return s;
    }
}
