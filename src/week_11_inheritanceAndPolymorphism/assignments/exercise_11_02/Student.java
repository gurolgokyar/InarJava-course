package week_11_inheritanceAndPolymorphism.assignments.exercise_11_02;

public class Student extends Person {
    public static final int freshman = 0;
    public static final int sophomore = 1;
    public static final int junior = 2;
    public static final int senior = 3;
    private int status;

    public Student(String name, String address, String phoneNumber, String emailAddress, int status) {
        super(name, address, phoneNumber, emailAddress);
       this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String toString() {
        return "  _Student_" +
                "\nName: " + getName() +
                "\nAddress: " + getAddress() +
                "\nPhone number: " + getPhoneNumber() +
                "\nEmail address: " + getEmailAddress() +
                "\nClassStatus: " + status;
    }
}
