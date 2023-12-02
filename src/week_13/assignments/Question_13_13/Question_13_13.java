package week_13.assignments.Question_13_13;

public class Question_13_13 {
    public static void main(String[] args) throws CloneNotSupportedException{
        Course course = new Course("Inar Academy");
        course.addStudent("Burak");
        course.addStudent("Emre");
        course.addStudent("Furkan");
        course.addStudent("Jack");

        System.out.println("Number of students in course1: " + course.getNumberOfStudents());
        displayTheStudents(course);

        Course course1 = course.clone();
        course1.addStudent("John");
        course1.addStudent("tonny");

        System.out.println("----------------------------------------------");
        System.out.println("Number of students in course2: " + course1.getNumberOfStudents());
        displayTheStudents(course1);
    }

    public static void displayTheStudents(Course course){
        for (int i = 0; i < course.getNumberOfStudents(); i++){
            System.out.print(course.getStudents()[i] + ", ");
        }
        System.out.println();
    }
}
