package javaDesignPatterns.strategy.one;

public class Strategy {

    //Strategy is a behavioral design pattern that turns a set of behaviors into objects and makes them interchangeable
    // inside original context object.

    //The original object, called context, holds a reference to a strategy object. The context delegates executing
    // the behavior to the linked strategy object. In order to change the way the context performs its work,
    // other objects may replace the currently linked strategy object with another one.

    //Usage examples: The Strategy pattern is very common in Java code. It’s often used in various frameworks to
    // provide users a way to change the behavior of a class without extending it.

    //Identification: Strategy pattern can be recognized by a method that lets a nested object do the actual work,
    // as well as a setter that allows replacing that object with a different one.

    //Payment method in an e-commerce app
    //In this example, the Strategy pattern is used to implement the various payment methods in an
    // e-commerce application. After selecting a product to purchase, a customer picks a payment method: either Paypal or credit card.
    //
    //Concrete strategies not only perform the actual payment but also alter the behavior of the checkout form,
    // providing appropriate fields to record payment details.


}
