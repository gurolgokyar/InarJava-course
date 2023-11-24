package week_10_objectOrientedThinking.workiningArea.Integer;

public class TestIntegerClass {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        System.out.println("------------------------");
        Integer i1 = Integer.valueOf("2");
        Integer i2 = Integer.valueOf("4");
        System.out.println(i1.compareTo(i2));

        System.out.println("-------------------------");
        System.out.println(Integer.parseInt("11",3));
        System.out.println(Integer.parseInt("111",5));
        System.out.println(Double.parseDouble("2.2"));

        System.out.println("-------------------------");
        Integer[] intValues = {1, 2, 3, 4};
        System.out.println(intValues[0].compareTo(intValues[3]));
        System.out.println(intValues[0] + intValues[1] + intValues[2] + intValues[3]);
    }
}

