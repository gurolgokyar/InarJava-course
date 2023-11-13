package week_10_objectOrientedProgramind_2.exercise_10_22;

public class Question_10_22 {
    public static void main(String[] args) {
        MyString1 myString1 = new MyString1("İNAR".toCharArray());
        System.out.println(myString1);
        System.out.println(myString1.toLowerCase());

        MyString1 subMyString1 = myString1.toLowerCase().subString(0,3);
        System.out.println(subMyString1);
        System.out.println(subMyString1.length());

        MyString1 myString2 = new MyString1("inar".toCharArray());
        System.out.println(myString1.equals(myString2));
        System.out.println(myString1.toLowerCase().equals(myString2));

        MyString1 myString3 = myString2.valueOf(65913);
        System.out.println(myString3);
    }

}
