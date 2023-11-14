package week_11_objectOrientedPrograming_3.working_area;

public class TestClass {
    public TestClass() {
        System.out.println("Hello world 1");
    }

    public TestClass(String s) {
        System.out.println("Hello world 2 " + s);
    }
    public int getF(int a){
        return 13;
    }
    public int getF(double b){
        return 23;
    }
    // *** Instance methods can be overloading but
    // ***static methods can not be overriding
    //***Overriding methods can not be in  same class

}

class A extends TestClass {
    String s;
   // public A() {
        // If there is not a no-argument constructor in the super class you must explicitly write the constructor of
        // the super class in the sub-class like blow
        //super("Calm dawn!");
//        s = "";
//        System.out.println("Hello world 3");
  //  }

    public A(String s) {
        this.s = s;
        //super("Calm dawn 2!");
        //System.out.println("Hello world 4");
    }
}
class C extends TestClass{
    String s;
    public C(String s){
        this.s = s;
    }
}

class B {
    public static void main(String[] args) {
        System.out.println(new A("Key").equals(new A("Key")));

//       A a = new A();
//       A a1 = new A("Hey");
    }
}
