package week_06.assignments;

public class Question_06_38 {
    public static void main(String[] args) {
       for (int i = 1; i <= 200; i++){
           if (i <= 100){
               System.out.print(getRandomUpperCaseLetter() + " ");
               if (i % 10 == 0){
                   System.out.println();
               }
           }else {
               System.out.print(getRandomDigit() + " ");
               if (i % 10 == 0){
                   System.out.println();
               }
           }
       }
    }

    public static char getRandomUpperCaseLetter(){
        return getRandomCharacter('A','Z');
    }
    public static char getRandomCharacter(char ch1, char ch2){
        return (char)(ch1 + Math.random() * (ch2 -ch1 + 1));
    }
    public static char getRandomDigit(){
        return  getRandomCharacter('0','9');
    }
}
