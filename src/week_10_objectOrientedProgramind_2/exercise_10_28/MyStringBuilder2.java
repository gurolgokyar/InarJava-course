package week_10_objectOrientedProgramind_2.exercise_10_28;

public class MyStringBuilder2 {
    private String s;

    public MyStringBuilder2() {
       this.s = "";
    }

    public MyStringBuilder2(char[] chars) {
        s = String.valueOf(chars);
    }

    public MyStringBuilder2(String s) {
        this.s = s;
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        String s1 = this.s.substring(0, offset);
        String s2 = this.s.substring(offset);
        this.s = s1 + s.toString() + s2;
        return this;
    }

    public MyStringBuilder2 reverse() {
        String s1 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s1 += s.charAt(i);
        }
        s = s1;
        return this;
    }

    public MyStringBuilder2 substring(int begin) {
        return new MyStringBuilder2(s.substring(begin));

        //You can use the below method
//        String s1 = "";
//        for (int i = begin; i < s.length(); i++) {
//            s1 += s.charAt(i);
//        }
//        return new MyStringBuilder2(s1);
    }

    public MyStringBuilder2 toUpperCase() {
        s = s.toUpperCase();
        return this;
    }
    public String toString(){
        return s;
    }
}
