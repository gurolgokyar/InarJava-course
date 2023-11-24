package week_11_inheritanceAndPolymorphism.assignments.exercise_11_02;

public class Faculty extends Employee{
    private String officeHours;
    private String rank;
    public Faculty(){

    }
    public Faculty(String name, String address, String phoneNumber, String emailAddress, int office, double salary,
                   String officeHours, String rank){
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    public String toString(){
        return "  _Faculty_" +
                "\nName: " + getName() +
                "\nAddress: " + getAddress() +
                "\nPhone number: " + getPhoneNumber() +
                "\nEmail address: " + getEmailAddress() +
                "\nOffice: " + getOffice() +
                "\nSalary: " + getSalary() +
                "\nHiredDate: " + getDateHired() +
                "\nOfficeHours: " + officeHours +
                "\nRank: " + rank;
    }
}
