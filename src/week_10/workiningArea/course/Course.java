package week_10.workiningArea.course;

public class Course {
    private String courseName;
    private String[] students = new String[10];
    private int numberOfStudents;
    public Course(String courseName){
        this.courseName = courseName;
    }
    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
        if (numberOfStudents == students.length){
            String[] temp = new String[2 * numberOfStudents];
            System.arraycopy(students,0,temp,0,numberOfStudents);
            students = temp;
        }
    }
    public void dropStudent(String student){
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i] == student){
                String[] temp = new String[numberOfStudents - 1];
               System.arraycopy(students,0,temp,0,i - 1);
               System.arraycopy(students,i + 1, temp,i,numberOfStudents - 1);
               students = temp;
               numberOfStudents--;
            }
        }
    }
    public String getCourseName(){
        return courseName;
    }
    public String[] getStudents(){
        return students;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }

}
