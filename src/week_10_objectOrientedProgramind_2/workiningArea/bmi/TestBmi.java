package week_10_objectOrientedProgramind_2.workiningArea.bmi;

public class TestBmi {
    public static void main(String[] args) {

        BMI bmi1 = new BMI("Kim Yang", 18, 145, 70);
        System.out.println("The BMI for " + bmi1.getName() + " is "
                + bmi1.getBmi() + " " + bmi1.getStatus());

        BMI bmi2 = new BMI("Susan King", 215, 70);
        System.out.println("The BMI for " + bmi2.getName() + " is "
                + bmi2.getBmi() + " " + bmi2.getStatus());
    }
}