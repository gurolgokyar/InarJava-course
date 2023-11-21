package week_12_exceptionHandling.workingArea;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadFileFromURL {
    public static void main(String[] args) {
        System.out.println("Enter an URL: ");
        String urlstring = new Scanner(System.in).next();
        try {
            java.net.URL url = new URL(urlstring);
            Scanner input = new Scanner(url.openStream());
            int counter = 0;

            while (input.hasNext()) {
                input.next();
                counter += input.nextLine().length();
            }

            System.out.println("The file size is " + counter + " characters");

        } catch (MalformedURLException ex) {
            System.out.println("Invalid URL!");
        } catch (IOException ex) {
            System.out.println("I/O Errors: no such file");
        }
    }
}
