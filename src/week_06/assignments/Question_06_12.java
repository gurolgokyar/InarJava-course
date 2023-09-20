package week_06.assignments;

public class Question_06_12 {
    public static void main(String[] args) {
        printChars('1','Z',10);
    }

    public static void printChars(char ch1, char ch2, int numberPerLine){
      for (char ch = '1';ch <= 'Z';ch++){
          System.out.print(ch + " ");
          if ((ch - '1' + 1) % numberPerLine == 0){
              System.out.println();
          }
        }
    }
}
