package week_07.assignment;

public class Question_07_22 {
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        int[] positionOfQueens = getAPosition();

        if (isPositionsAvailable(positionOfQueens)) {
            displayThePositions(positionOfQueens);
        } else {
            playGame();
        }
    }

    public static int[] getAPosition() {
        int[] positions = new int[8];
        for (int i = 0; i < positions.length; i++) {
            positions[i] = i;
        }
        //Shuffle the array
        for (int i = 0; i < positions.length; i++) {
            int p = (int) (Math.random() * positions.length);

            int temp = positions[p];
            positions[p] = positions[i];
            positions[i] = temp;
        }
        return positions;
    }

    public static boolean isPositionsAvailable(int[] positions) {
        for (int i = 0; i < positions.length -1; i++) {
            for (int k = i + 1; k < positions.length; k++) {
                  if (Math.abs(i - k) == Math.abs(positions[i] - positions[k])){
                      return false;
                  }
            }
        }
        return true;
    }

    public static void displayThePositions(int[] positions){
        for (int i = 0; i < positions.length; i++) {
            for (int j = 0; j < positions[i]; j++) {
                System.out.print("| ");
            }
            System.out.print("|Q");

            for (int j = positions[i]; j < positions.length; j++) {
                System.out.print("| ");
            }
            System.out.println();
        }
    }

}
