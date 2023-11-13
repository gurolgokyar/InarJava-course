package week_10_objectOrientedProgramind_2.exercise_10_02;

import week_10_objectOrientedProgramind_2.workiningArea.bmi.BMI;

public class Question_10_02 {
    public static void main(String[] args) {
        BMI person1 =new BMI("Martin ",26,500,20,45);
        BMI person2 =new BMI("Adam Smith",18,1050,185);

        System.out.println(person1);
        System.out.println(person2);
    }
}
