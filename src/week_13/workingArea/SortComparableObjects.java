package week_13.workingArea;

import java.math.BigInteger;

public class SortComparableObjects {
    public static void main(String[] args) {
        String[] cities = {"Savannah", "Boston", "Atlanta", "Tampa"};
        java.util.Arrays.sort(cities);
        for (String s : cities) {
            System.out.print(s + " ");
        }
        System.out.println();

        BigInteger[] hugeNumbers = {new BigInteger("2323231092923992"),
                new BigInteger("432232323239292"),
                new BigInteger("54623239292")
        };
        java.util.Arrays.sort(hugeNumbers);
       for (BigInteger number: hugeNumbers){
           System.out.print(number + " ");
       }
    }
}
