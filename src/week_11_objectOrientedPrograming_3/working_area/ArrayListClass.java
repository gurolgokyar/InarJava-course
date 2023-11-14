package week_11_objectOrientedPrograming_3.working_area;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Istanbul");
        cities.add("Maras");
        cities.add("Mersin");
        System.out.println(cities);
        cities.add(1, "Bolu");
        System.out.println(cities);
        System.out.println(cities.contains("Tokat"));
        System.out.println(cities.contains("Maras"));
        System.out.println(cities.get(0));
        System.out.println(cities.indexOf("Maras"));
        System.out.println(cities.indexOf("Tokat"));
        cities.add("Istanbul");
        System.out.println(cities.indexOf("Istanbul"));
        System.out.println(cities.lastIndexOf("Istanbul"));
        System.out.println(cities);
        System.out.println(cities);
        System.out.println(cities.size());

        System.out.println(cities.remove("Istannbul"));
        System.out.println(cities.remove("Istanbul"));
        System.out.println(cities.remove(0));
        boolean b = cities.remove("Is");
        String s = cities.remove(0);

        cities.remove("Is");//Return boolean typ
        cities.remove(0);// Return object typ

        System.out.println(cities);
        cities.set(0, "Karaman");
        System.out.println(cities);

    }
}
