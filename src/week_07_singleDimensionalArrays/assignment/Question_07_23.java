package week_07_singleDimensionalArrays.assignment;

public class Question_07_23 {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[100];
        lockers = getOpenLockers(lockers);

        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]){
                System.out.print("L" + (i + 1) + " ");
            }
        }
    }

    public static boolean[] getOpenLockers(boolean[] lockers) {
        for (int i = 0; i < lockers.length; i++) {
            for (int j = i; j < lockers.length; j += i + 1) {
                lockers[j] = !lockers[j];
            }
        }
        return lockers;
    }
}
