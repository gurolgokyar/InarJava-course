package week_10.exercise_10_09;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents++] = student;
        if (numberOfStudents == students.length){
            String[] temp = new String[students.length];
            System.arraycopy(students,0,temp,0,numberOfStudents-1);
            students = temp;
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                for (int j = i; j < numberOfStudents; j++) {
                    students[j] = students[j + 1];
                }
                break;
            }
        }
        numberOfStudents--;
    }

    public void clear(){
        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = "";
        }
        numberOfStudents = 0;
    }
    public void displayStudents(){
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(students[i]);
        }
    }
}
