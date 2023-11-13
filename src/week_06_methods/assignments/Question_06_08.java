package week_06_methods.assignments;

public class Question_06_08 {
    public static void main(String[] args) {
        System.out.printf("%-10s\t%-10s\t|\t%-10s\t%-10s\n","Celsius","Fahrenheit","Fahrenheit","Celsius");
        for (int i = 0; i < 48; i++){
            System.out.print("-");
        }
        System.out.println();

        for (int c = 40,f=120; c > 30; c--,f -=10){
            System.out.printf("%-10d\t%-10.2f\t|\t%-10d\t%-10.2f\n",c,celsiusToFahrenheit(c),f,
                    fahrenheitToCelsius(f));
        }
    }

    public static double celsiusToFahrenheit(int c){
        return (9.0/5)*c + 32;
    }

    public static double fahrenheitToCelsius(int f){
        return (5.0/9)*(f - 32);
    }
}
