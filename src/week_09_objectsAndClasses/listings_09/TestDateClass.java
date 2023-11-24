package week_09_objectsAndClasses.listings_09;

public class TestDateClass {
    public static void main(String[] args) {
        java.util.Date date1 = new java.util.Date();
        System.out.println(date1.toString());
        System.out.println(date1.getTime());

        date1.setTime(61000);
        System.out.println(date1.toString());
        System.out.println(date1.getTime());
    }
}
