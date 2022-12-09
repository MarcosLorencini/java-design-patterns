package javaDesignPatterns.strategy.one;

/**
 * Dummy credit card class.
 */
public class Credicard {
    private int amount;
    private String number;
    private String date;
    private String cvv;

    public Credicard(String number, String date, String cvv) {
        this.amount = 100_000;
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
