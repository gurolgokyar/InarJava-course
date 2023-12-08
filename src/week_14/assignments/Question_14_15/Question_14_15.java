package week_14.assignments.Question_14_15;

import java.util.*;

public class Question_14_15 {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the number of the elements(n): ");
            int numberOfTheElements = input.nextInt();

            if (numberOfTheElements < 1){
                System.out.println("Number of elements should be greater than 0");
                System.exit(1);
            }

            ArrayList<Integer> list = new ArrayList<>();
            System.out.println("Enter the elements of the ArrayList (each in the range [1, " + numberOfTheElements +
                    "]):");
            for (int i = 0; i < numberOfTheElements; i++) {
                int number = input.nextInt();
                if (number > numberOfTheElements && number< 1){
                    throw new InputMismatchException();
                }
               list.add(number);
            }
            ArrayList<Integer> missingNumbers = getMissingNumbers(list,numberOfTheElements);
            System.out.println((missingNumbers.size() == 0) ? "There is not any missing number." : "Number missing " +
                    "from the ArrayList: " + missingNumbers);
        }catch (InputMismatchException ex){
            System.out.println("Invalid input!");
        }
    }

    public static ArrayList<Integer> getMissingNumbers(ArrayList<Integer> list, int numberOfElements){
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 1; i <= numberOfElements; i++) {
             map.put(i, false);
        }

        for (int i = 0; i < list.size(); i++) {
            map.put(i, true);
        }

        ArrayList<Integer> missingNumbers = new ArrayList<>();
        for (Map.Entry<Integer, Boolean> entry : map.entrySet()) {
            if (!entry.getValue()){
                missingNumbers.add(entry.getKey());
            }
        }
        return missingNumbers;
    }
}
