package week_11.working_area;

public class TestClass {
    public TestClass() {
        System.out.println("Hello world 1");
    }

    public TestClass(String s) {
        System.out.println("Hello world 2 " + s);
    }

}

class A extends TestClass {
    public A() {
        // If there is not a no-argument constructor in the super class you must explicitly write the constructor of
        // the super class in the sub-class like blow
        //super("Calm dawn!");
        System.out.println("Hello world 3");
    }

    public A(String s) {
        //super("Calm dawn 2!");
        System.out.println("Hello world 4");
    }
}

class B {
    public static void main(String[] args) {
       A a = new A();
       A a1 = new A("Hey");
    }
}
