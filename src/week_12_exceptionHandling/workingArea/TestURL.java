package week_12_exceptionHandling.workingArea;

import java.net.MalformedURLException;
import java.net.URL;

public class TestURL {
    public static void main(String[] args) {
        try{
            URL url = new URL("http://www.google.com/index.html");
            System.out.println("The URL is valid");
        }catch (MalformedURLException ex){
            ex.printStackTrace();
        }
    }
}
