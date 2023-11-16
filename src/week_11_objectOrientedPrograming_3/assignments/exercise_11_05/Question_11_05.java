package week_11_objectOrientedPrograming_3.assignments.exercise_11_05;

public class Question_11_05 {
    public static void main(String[] args) {
        String[] names = {"Nisanur Altuntas", "Gurkan Serteser", "Sinan Cetin", "Mehmet Toprak", "Sefa Atakul", "Musa " +
                "Denis", "Berkan Eris"};
        Course course = new Course("Inar Course");
        for (int i = 0; i < names.length; i++) {
            course.addStudent(names[i]);
        }

        System.out.println("After adding student to course..");
        displayArray(course.getStudents());
        String[] studentsToDrop = {"Sinan Cetin", "Mehmet Toprak", "Berkan Eris"};


        System.out.println("--------------------------------");
        dropStudent(studentsToDrop, course);
        System.out.println("After dropping student from the course..");
        displayArray(course.getStudents());

    }

    public static void displayArray(String[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " - ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void dropStudent(String[] students, Course course) {
        for (int i = 0; i < students.length; i++) {
            course.dropStudent(students[i]);
        }
    }
}
