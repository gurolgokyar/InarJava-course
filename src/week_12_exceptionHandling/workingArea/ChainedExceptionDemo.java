package week_12_exceptionHandling.workingArea;

public class ChainedExceptionDemo {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception ex) {
            System.out.println("------------");
            ex.printStackTrace();
        }
    }

    public static void method1() throws Exception {
        try {
            method2();
        } catch (Exception ex) {
           // throw new Exception("New info from method1", ex);
            System.out.println("Hello world");
            throw new Exception("New info from method1", ex);
        }
    }

    public static void method2() throws Exception {
        System.out.println("Method 2");
        throw new Exception("New info from  method2");
    }
}
