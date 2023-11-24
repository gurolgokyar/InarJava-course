package week_10_objectOrientedThinking.exercise_10_09;

public class Question_10_09 {
    public static void main(String[] args) {
        Course course = new Course("Java");

        course.addStudent("Özgür Kartal");
        course.addStudent("Bilal Topal");
        course.addStudent("Ada Kaya");

        course.displayStudents();
        System.out.println("------------------------");

        course.dropStudent("Bilal Topal");
        course.displayStudents();
        System.out.println("------------------------");
    }
}
