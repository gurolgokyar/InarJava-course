package week_11_objectOrientedPrograming_3.assignments.exercise_11_02;

public class Question_11_02 {
    public static void main(String[] args) {
        Object person = new Person("Gurol","Istanbul","9999999999","gurolgokyar@gmail.com");
        System.out.println(person + "\n");

        Student student = new Student("Nafiz","Ankara","3333333333","nafix@gmail.com",0);
        System.out.println(student+ "\n");

        Employee employee = new Employee("Recai","Istanbul","6666666666","recai@gmail.com",990,60000);
        System.out.println(employee+ "\n");

        Faculty faculty = new Faculty("Serhat","Texas, Dallas","4323333333","serhat@ınar.com",101,50000,"10am to 6pm",
                "manager");
        System.out.println(faculty+ "\n");

        Stuff stuff = new Stuff("Elon","California","20304567890","elon@mosk.com",12,6_005_000,"CIO");
        System.out.println(stuff);

    }
}
