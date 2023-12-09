package week_14.assignments.Question_14_20;

import java.math.BigInteger;

public class Question_14_20 {
    public static void main(String[] args) {
        Post post1 = new Post(new BigInteger("1"));
        post1.addTag("Java");
        post1.addTag("Coding");
        post1.addTag("Programing");

        Post post2 = new Post(new BigInteger("2"));
        post2.addTag("Java");
        post2.addTag("Technology");
        post2.addTag("Coding");

        Post post3 = new Post(new BigInteger("3"));
        post3.addTag("Java");
        post3.addTag("Coding");
        post3.addTag("C++");

        System.out.println(post1);
        System.out.println(post2);
        System.out.println("Does post1 have the tag 'Java'? " + post1.isContains("Java"));
        System.out.println("Does post2 have the tag 'Java'? " + post2.isContains("Technology"));
        post3.remove("C++");
        System.out.println(post3);
    }
}
