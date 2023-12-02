package week_13.workingArea;

import java.util.ArrayList;

public class TestSkill {
    public static void main(String[] args) {
        String str = "sgggm";
        System.out.println(isDuplicated(str));

    }

    public static boolean isDuplicated(String str){
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (!list.contains(str.charAt(i))){
               list.add(str.charAt(i));
            }else {
                return false;
            }
        }
        return true;
    }
}
