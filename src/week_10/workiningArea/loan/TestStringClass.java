package week_10.workiningArea.loan;

public class TestStringClass {
    public static void main(String[] args) {
        String s1 = "Well come to java";
        String s2 = new String("Well come to java");
        String s3 = "Well come to java";
        String s4 = "hey you hey come hear hey";

        System.out.println((s1 == s2) + " " + (s1 == s3));
        System.out.println("-----------------------------------");
        System.out.println(s1.replace('e','i'));
        System.out.println(s1);

        System.out.println("\n-------------------------------------");
        System.out.println(s1.replace("el","hey"));
        System.out.println(s1);

        System.out.println("\n--------------------------------------");
        System.out.println(s4.replace("hey" , "stop"));
        System.out.println(s4);

        System.out.println("\n--------------------------------------");
        System.out.println(s4.replaceAll("hey" , "stop"));
        System.out.println(s4);

        System.out.println("\n--------------------------------------");
        System.out.println(s4.replaceFirst("hey" , "stop"));
        System.out.println(s4);

        System.out.println("\n--------------------------------------");
        String[] array = s1.split("e");
        for (String s:array ) {
            System.out.println(s);
        }

        System.out.println("\n------------------------------------------");
        String s5 = "440-02-4534";
        System.out.println(s5.matches("\\d{3}-\\d{2}-\\d{4}"));

        System.out.println("\n------------------------------------------");
        String s6 = "123-02-4534";
        System.out.println(s5.matches("\\d{3}-\\d{2}-\\d{4}"));

        System.out.println("\n--------------------------------------------");
        System.out.println(s4.replaceAll("[hy]","GGG"));

        System.out.println("\n--------------------------------------------");
        System.out.println(s4);
        String[] array2 = s4.split("[hy]");
        for (String s : array2) {
            System.out.println(s);
        }
    }
}
