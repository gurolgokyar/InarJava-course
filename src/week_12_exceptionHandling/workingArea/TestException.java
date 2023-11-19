package week_12_exceptionHandling.workingArea;

import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {

        try {
            int[] numbers = getInput();
            System.out.println(sum(numbers));
        } catch (IndexOutOfBoundsException ex) {
            ex.printStackTrace();
            System.out.println("--------------------------------");
            System.out.println(ex.getMessage());
            System.out.println("--------------------------------");
            System.out.println(ex.toString());
            System.out.println("--------------------------------");
            System.out.println("--------------------------------");
            StackTraceElement[] stackTraceElements = ex.getStackTrace();
            for (int i = 0; i < stackTraceElements.length; i++) {
                System.out.println(stackTraceElements[i].getMethodName());
                System.out.println(stackTraceElements[i].getClassName());
                System.out.println(stackTraceElements[i].getLineNumber());
                System.out.println("************************************");
            }
        } catch (Throwable ex){
            System.out.println("You entered illegal input");
        }

        }

        public static int sum ( int[] array) throws IndexOutOfBoundsException {
            int sum = 0;
            for (int i = 0; i <= array.length; i++) {
                sum += array[i];
                if (i == array.length) {
                    throw new IndexOutOfBoundsException("Hello world");
                }
            }

            return sum;
        }

        public static int[] getInput ()  throws Throwable {
            Scanner input = new Scanner(System.in);
            int[] inputs = new int[5];
            for (int i = 0; i < 5; i++) {
                inputs[i] = input.nextInt();
            }
            return inputs;
        }
    }
