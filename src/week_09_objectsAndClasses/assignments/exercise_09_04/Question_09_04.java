package week_09_objectsAndClasses.assignments.exercise_09_04;

import java.util.Random;

public class Question_09_04 {
    public static void main(String[] args) {
        Random random = new Random(1000);
        for (int i = 0; i < 50; i++) {
            System.out.print(random.nextInt(100) + " ");
            if ((i + 1) % 10 == 0){
                System.out.println();
            }
        }
    }
}
