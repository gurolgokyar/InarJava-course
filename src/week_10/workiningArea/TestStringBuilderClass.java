package week_10.workiningArea;

public class TestStringBuilderClass {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        s.append("Well");
        s.insert(3, 4);
        System.out.println(s);

        s.deleteCharAt(4);
        System.out.println(s);

        s.deleteCharAt(s.length() - 1);
        s.append('l');
        System.out.println(s);

        System.out.println("------------------------");
        s.insert(2,"everything is under control");
        System.out.println(s);

        s.delete(2,2 + "everything is under control".length());
        System.out.println(s);

        char[] ch = " everything is under control".toCharArray();
        s.append(ch);
        System.out.println(s);

        s.replace(0,1,"hey man ");
        System.out.println(s);

        System.out.println(s.deleteCharAt(1));

        System.out.println("-------------------------------------");
        StringBuilder s2 = new StringBuilder();
        s2.append("hello world");
        System.out.println(s2.length());
        s2.setLength(5);
        System.out.println(s2.length());
        System.out.println(s2);
        System.out.println(s2.capacity() + " ?");

        System.out.println("------------------------------------");
        s2.append("        ");
        System.out.println(s2);
        System.out.println(s2.length());

        System.out.println("--------------------------------------");
        System.out.println(s2.capacity());
        s2.trimToSize();
        System.out.println(s2.length());
        System.out.println(s2.capacity());

        System.out.println("----------------");

        String ss = s2.toString();
        System.out.println(ss);
        System.out.println(ss.length());
        String sss = ss.trim();
        System.out.println(sss.length());

    }
}
