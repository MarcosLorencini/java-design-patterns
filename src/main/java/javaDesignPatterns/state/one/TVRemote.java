package javaDesignPatterns.state.one;


public class TVRemote {

    //Now let´s write a simple program to test our state pattern implementation of TV Remote.

    //Output of above program is same as the basic implementation of TV Remote without using state pattern.

    public static void main(String[] args) {
        TVContext context = new TVContext();
        State tvStartState = new TVStartState();
        State tvStopState = new TVStopState();

        context.setState(tvStartState);
        context.doAction();

        context.setState(tvStopState);
        context.doAction();
    }
}
