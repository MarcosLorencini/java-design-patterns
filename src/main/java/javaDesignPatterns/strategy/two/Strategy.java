package javaDesignPatterns.strategy.two;

// Strategy design patter is one of the behavioral design pattern. Strategy patter is used when we
//have multiple algorithm for a specific task and client decides the actual implementation to be used
//at runtime

//Stategy pattern is also known as Polcy Pattern. We define multiple algorithms and let client
//application pass the algorithm to be used as a parameter. One of the best exemple of strategy pattern
// is Collections.sort() method that takes Comparator parameter. Based on the different ways. For our
//example, we will try to implement a simple Shopping Cart where we have two payment strategies -
//using Credit Card or using PayPal.