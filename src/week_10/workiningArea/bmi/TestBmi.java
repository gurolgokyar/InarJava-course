package week_10.workiningArea.bmi;

public class TestBmi {
    public static void main(String[] args) {

        Bmi bmi1 = new Bmi("Kim Yang", 18, 145, 70);
        System.out.println("The BMI for " + bmi1.getName() + " is "
                + bmi1.getBmi() + " " + bmi1.getStatus());

        Bmi bmi2 = new Bmi("Susan King", 215, 70);
        System.out.println("The BMI for " + bmi2.getName() + " is "
                + bmi2.getBmi() + " " + bmi2.getStatus());
    }
}