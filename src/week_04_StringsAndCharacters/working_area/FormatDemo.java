package week_04_StringsAndCharacters.working_area;

public class FormatDemo {
    public static void main(String[] args) {
        double degree30=Math.toRadians(30);
        double degree60=Math.toRadians(60);
        System.out.printf("%-7s   %-7s   %-7s   %-7s   %-7s\n","Degrees","Radians","Sine","Cosine","Tangent");
        System.out.printf("%-7d   %-7.4f   %-7.4f   %-7.4f   %-7.4f\n", 30,degree30,Math.sin(degree30),
                Math.cos(degree30),Math.tan(degree30));
        System.out.printf("%-7d   %-7.4f   %-7.4f   %-7.4f   %-7.4f\n", 60,degree60,Math.sin(degree60), Math.cos(degree60),Math.tan(degree60));
    }
}
