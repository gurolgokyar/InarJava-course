package week_04.assignments;

public class Question_04_25 {
    public static void main(String[] args) {
        //Generate three random letters
        // and four  random digits
        char letter1=(char)('A' + (Math.random()*26));
        char letter2=(char)('A' + (Math.random()*26));
        char letter3=(char)('A' + (Math.random()*26));

        int number1=(int)(Math.random()*10);
        int number2=(int)(Math.random()*10);
        int number3=(int)(Math.random()*10);
        int number4=(int)(Math.random()*10);

        //Generate a string variable and combine all of those random variable
        String plateNumber =""+letter1+letter2+letter3+number1+number2+number3+number4;

        System.out.println("Generated plate number: " + plateNumber);
    }
}
