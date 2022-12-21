package javaDesignPatterns.state.one;

//Now we are ready to implement our Context object that will change its behavior based ont it´s
//internal state.

//Notice that Context also implements State and keep a reference of it´s current state and forward
//the request to the state implementation

public class TVContext implements State {

    private State tvState;

    public void setState(State state) {
        this.tvState = state;
    }

    public State getState() {
        return this.tvState;
    }



    @Override
    public void doAction() {
        this.tvState.doAction();
    }


}
