package week_10_objectOrientedProgramind_2.workiningArea.bmi;

public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;
    public static final int INCH_PER_FOOT = 12;

    public BMI(String name, int age, double weight, double feet, double inches) {
        this(name,age,weight,feet * INCH_PER_FOOT + inches);
    }

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public BMI(String name, double weight, double height) {
        this(name, 20, weight, height);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBmi() {
        double bmi = weight * KILOGRAMS_PER_POUND / ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
       return (int)(bmi * 100) / 100.0;
    }


    public String getStatus() {
        double bmi = getBmi();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "OverWeight";
        } else {
            return "Obese";
        }
    }
    public String toString(){
        return "Name: " + name +
                "\nBMI: " + getBmi() + " " + getStatus();
    }
}
