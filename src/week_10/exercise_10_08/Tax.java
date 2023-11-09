package week_10.exercise_10_08;

import week_08.assignments.Question_08_12;

public class Tax {
    private int fillingStatus;
    public static final int SINGLE_FILLER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1;
    public static  final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;
    private double[][] brackets;
    private double[] rates;
    private double taxableIncome;

    public Tax(){
    }
    public Tax(int fillingStatus, double[][] brackets, double[] rates, double taxableIncome){
       this.fillingStatus = fillingStatus;
       this.brackets = brackets;
       this.rates = rates;
       this.taxableIncome = taxableIncome;
    }

    public int getFillingStatus() {
        return fillingStatus;
    }

    public void setFillingStatus(int fillingStatus) {
        this.fillingStatus = fillingStatus;
    }

    public double[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(double[][] brackets) {
        this.brackets = brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
    public double getTax(){
        return Question_08_12.calculateTheTax(taxableIncome,fillingStatus,brackets,rates);
    }
}
