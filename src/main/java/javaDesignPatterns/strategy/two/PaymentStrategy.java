package javaDesignPatterns.strategy.two;


//First o all we create the interface for our strategy patter
//example, in our case to pay the amount passed as argument. PaymentStrategy.java

public interface PaymentStrategy {

    public void pay(int amount);
}

//Now we will have to create concrete implementation of algorithms for payment using credit/debit
//card or through paypal. CreditCardStrategy.java and PaypalStrategy.java
