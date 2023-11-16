package week_11_objectOrientedPrograming_3.assignments.exercise_11_05;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();
    public Course(String courseName){
        this.courseName = courseName;
    }
    public void addStudent(String student){
        students.add(student);
    }
    public String[] getStudents(){
        String[] students1 = new String[students.size()];
        return students.toArray(students1);
    }

    public int getNumberOfStudents(){
        return students.size();
    }

    public String getCourseName(){
        return courseName;
    }
    public void dropStudent(String student){
        students.remove(student);
    }
}
