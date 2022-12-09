package javaDesignPatterns.strategy.one;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Concrete strategy. Implements credit card payment method.
 */
public class PayByCreditCard  implements PayStrategy {
    private BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private Credicard card;


    /**
     * Collect credit card data.
     */
    @Override
    public void collectPaymentDetails() {
        try {
            System.out.println("Enter the card number: ");
            String number = READER.readLine();
            System.out.println("Enter the card expiration date 'mm/yy': ");
            String date = READER.readLine();
            System.out.println("Enter hte CVV code: ");
            String cvv = READER.readLine();
            card = new Credicard(number, date, cvv);

            // Validate credit card number
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * After card validation we can charge customer's credit card.
     */
    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("Paying " + paymentAmount + "using Credit Card");
            card.setAmount(card.getAmount() - paymentAmount);

        }
        return false;
    }

    private boolean cardIsPresent() {
        return card != null;
    }


}
