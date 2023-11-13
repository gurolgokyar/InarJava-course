package week_10.exercise_10_27;

public class MyStringBuilder {
    public String s;

    public MyStringBuilder(String s) {
        this.s = s;
    }

    public MyStringBuilder append(MyStringBuilder s) {
        for (int i = 0; i < s.length(); i++) {
            this.s += s.charAt(i);
        }
        return new MyStringBuilder(this.s);

    }

    public MyStringBuilder append(int i) {
        s += i;
        return new MyStringBuilder(s);
    }

    public int length() {
        return s.length();
    }

    public char charAt(int index) {
        return s.charAt(index);
    }

    public MyStringBuilder toLowerCase() {
        //We should use s = s.toLowerCase() because if we don't write like this s can not change
        s = s.toLowerCase();
        return new MyStringBuilder(s.toLowerCase());
    }

    public MyStringBuilder subString(int begin, int end) {
        String s1 = "";
        for (int i = begin; i < end; i++) {
            s1 += s.charAt(i);
        }
        return new MyStringBuilder(s1);
    }

    public String toString() {
        return s;
    }
}
