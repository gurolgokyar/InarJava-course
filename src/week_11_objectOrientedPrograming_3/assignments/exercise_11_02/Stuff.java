package week_11_objectOrientedPrograming_3.assignments.exercise_11_02;

public class Stuff extends Employee{
    private String title;
    public Stuff(){

    }
    public Stuff(String name, String address, String phoneNumber, String emailAddress, int office, double salary,
                 String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String toString(){
        return "  _Stuff_" +
                "\nName: " + getName() +
                "\nAddress: " + getAddress() +
                "\nPhone number: " + getPhoneNumber() +
                "\nEmail address: " + getEmailAddress() +
                "\nOffice: " + getOffice() +
                "\nSalary: " + getSalary() +
                "\nHiredDate: " +getDateHired() +
                "\nTitle: " + title;
    }
}
