package week_12_exceptionHandling.assignments.exercise_12_32;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a URL: ");
        String urlString = input.next();

        crawler(urlString);
    }

    public static void crawler(String urlString) {
        try {
            ArrayList<String> urls = new ArrayList<>();
            urls.add(urlString);

            int numberOfUrlTraversed = 0;
            URL url;
            Scanner input;

            while (urls.size() > numberOfUrlTraversed) {
                urlString = urls.get(numberOfUrlTraversed);
                url = new URL(urlString);
                numberOfUrlTraversed++;
                input = new Scanner(url.openStream());

                while (input.hasNext()) {
                    String line = input.nextLine();
                    if (line.contains("Tamagotchi")) {
                        System.out.println("Craw: " + urlString);
                        System.out.println("The word is found!");
                        System.exit(1);
                    }
                    findNewUrls(urls, line);
                }
            }
            System.out.println("Craw: " + urlString);
            System.out.println("There isn't any url that contains the word!");
        } catch (Exception ex) {
            System.out.println("Error--> " + ex.getMessage());
        }
    }

    public static void findNewUrls(ArrayList<String> urls, String line) {
        int beginIndex = line.indexOf("http:");
        while (beginIndex >= 0) {
            int endIndex = line.indexOf("\"", beginIndex);

            if (endIndex > beginIndex) {
                String newUrl = line.substring(beginIndex, endIndex);
                if (urls.contains(newUrl)) {
                    urls.add(newUrl);
                }
            }
            beginIndex = line.indexOf("http:", endIndex);
        }
    }
}
