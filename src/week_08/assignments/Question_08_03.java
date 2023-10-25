package week_08.assignments;

public class Question_08_03 {
    public static void main(String[] args) {
        char[][] answers = getArray();
        char[] key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[][] counter = findNumberOfCorrectCount(answers, key);
        displayTheCorrectCount(counter);
    }

    public static char[][] getArray() {
        return new char[][]{
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        };
    }

    public static int[][] findNumberOfCorrectCount(char[][] answers, char[] key) {
        int[][] counter = new int[answers.length][answers[0].length];

        for (int student = 0; student < answers.length; student++) {
            int numberOfCorrectCount = 0;

            for (int questions = 0; questions < answers[0].length; questions++) {
                if (answers[student][questions] == key[questions]) {
                    numberOfCorrectCount++;
                }
            }
            counter[student][0] = student;
            counter[student][1] = numberOfCorrectCount;
        }
        return counter;
    }

    public static void displayTheCorrectCount(int[][] counter) {
        //Firstly sort the counter in increasing order
        int[][] sortedCounter = sortArray(counter);
        for (int i = 0; i < sortedCounter.length; i++) {
            System.out.printf("Student %d's correct count is %d\n",i,sortedCounter[i][1]);
        }
    }

    public static int[][] sortArray(int[][] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i][1];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j][1] < min) {
                    min = array[j][1];
                    index = j;
                }
            }
            if (index != i){
                array[index][1] = array[i][1];
                array[i][1] = min;

                //You must change the students' index too
                array[i][0] = index;
                array[index][0] = i;
            }
        }
        return array;
    }
}
