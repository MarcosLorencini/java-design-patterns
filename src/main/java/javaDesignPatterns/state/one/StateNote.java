package javaDesignPatterns.state.one;

public class StateNote {

    // If we have to change the behavior of an object based on its state, we can have a state variable in the
    //Object. Then use if-else condition block to perform different actions based on the state.
    //State design pattern is used to provide a systematic and loosely coupled way to achieve this through
    //Context and State implementations. State Pattern is the class that has a State reference to one of the
    //concrete implementation of the State. Context forwards the request to the state object for processing.
    //Let´s understand this with a simple example. Suppose we want to implement a TV Remote with a simple
    //button to perform action. If the state is ON, it will turn on the TV and if state is OFF, it will turn
    //of the TV. We can implement it using if-else condition like below.

    //The benefits of using State pattern to implement polymorphic behavior is cleary visible. The chances
    //of error are less and it´s very easy to add more states for additional behavior. Thus making our code
    //more robust, easily maintainable and flexible. Also State pattern helped in avoiding if-else or
    //switch-case conditional logic in this scenario. State Pattern is very similar to Strategy Pattern,
    //ckeck out Strategy Pattern in Java. Thats all for State design pattern in java.

}
