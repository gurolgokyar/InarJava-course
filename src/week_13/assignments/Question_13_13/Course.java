package week_13.assignments.Question_13_13;

import java.util.Arrays;

public class Course implements Cloneable{
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(){

    }

    public Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student){
        students[numberOfStudents++] = student;
    }

    public String[] getStudents(){
        return students;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public String getCourseName(){
        return courseName;
    }

    public void dropStudent(String student){
        for (int i = 0; i < student.length(); i++) {
            if (students[i].equals(student)){
                for (int j = i; j < students.length - 1; j++) {
                    students[j] = students[ j + 1];
                }
            }
        }
        String[] newArray = Arrays.copyOf(students,numberOfStudents -1);
        students = newArray;
    }

    public Course clone() throws CloneNotSupportedException{
        return (Course) super.clone();
    }

}
