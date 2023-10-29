package week_09.Questions_09.exercise_09_02;

public class Stock {
    private String symbol;
    private String name;
    final private double previousClosingPrice = 34.5;
    private double currentPrice;

    Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    String getSymbol() {
        return symbol;
    }

    double getChangePercent() {
        return (this.currentPrice - this.previousClosingPrice) / this.previousClosingPrice * 100;
    }

    public String toString() {
        return "Stock name             : " + this.name +
                "\nStock symbol           : " + this.symbol +
                "\nPrice-change percentage: " + this.getChangePercent();
    }
}
