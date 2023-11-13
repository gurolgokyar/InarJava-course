package week_08_twoDimensionalArrays.assignments;

import java.util.Scanner;

public class Question_08_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of banks: ");
        int numberOfBanks = input.nextInt();
        double[][] banks = new double[numberOfBanks][numberOfBanks];

        System.out.print("Enter minimum total assets for keeping a bank safe: ");
        double limit = input.nextDouble();

        displayUnsafeBanks(banks,limit);

    }

    public static void displayUnsafeBanks(double[][] banks,double limits) {
        Scanner input = new Scanner(System.in);
        double[] assets = new double[banks.length];

        for (int i = 0; i < banks.length; i++) {
            System.out.print("Enter bank " + i + "'s total assets,Enter the number of banks that borrowed money from " +
                    "bank " + i + ", Enter borrowers ID , Enter amount borrowed: ");
           assets[i] = input.nextDouble();
            int borrowedBanks = input.nextInt();
            for (int j = 0; j < borrowedBanks; j++) {
                banks[i][input.nextInt()] = input.nextDouble();
            }
        }
        boolean[] unsafeBanks = findUnsafeBanks(banks,assets,limits);
        System.out.print("Unsafe banks -> ");
        for (int i = 0; i < unsafeBanks.length; i++) {
            if (unsafeBanks[i]){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean[] findUnsafeBanks(double[][] banks, double[] assets, double limit){
        for (int i = 0; i < banks.length; i++) {
            double totalAsset = assets[i];
            for (int j = 0; j < banks[i].length; j++) {
                totalAsset += banks[i][j];
            }
            if (totalAsset < limit){
                for (int j = 0; j < banks.length; j++) {
                    if (i == j){
                        continue;
                    }
                    banks[j][i] = 0;
                }
            }
        }
        boolean[] unSafeBanks = new boolean[banks.length];
        for (int i = 0; i < banks.length; i++) {
            double totalAsset = assets[i];
            for (int j = 0; j < banks[i].length; j++) {
                totalAsset += banks[i][j];
            }
            if (totalAsset < limit) {
                unSafeBanks[i] = true;
            }
        }
        return unSafeBanks;
    }
}
