package week_11_inheritanceAndPolymorphism.assignments.exercise_11_02;

import week_10_objectOrientedThinking.exercise_10_14.MyDate;

public class Employee extends Person{
    private int office;
    private double salary;
    private MyDate dateHired = new MyDate();
    public Employee(){

    }
    public Employee(String name, String address, String phoneNumber, String emailAddress, int office, double salary){
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
    }

    public int getOffice() {
        return office;
    }

    public void setOffice(int office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }
    public String toString(){
        return "  _Employee_" +
                "\nName: " + getName() +
                "\nAddress: " + getAddress() +
                "\nPhone number: " + getPhoneNumber() +
                "\nEmail address: " + getEmailAddress() +
                "\nOffice: " + getOffice() +
                "\nSalary: " + getSalary() +
                "\nHiredDate: " + dateHired.toString();
    }
}
