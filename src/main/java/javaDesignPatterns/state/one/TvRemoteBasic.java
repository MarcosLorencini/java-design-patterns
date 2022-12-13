package javaDesignPatterns.state.one;

public class TvRemoteBasic {

    private String state="";

    public void setState(String state) {
        this.state = state;
    }

    public void doAction(){
        if(state.equalsIgnoreCase("ON")) {
            System.out.println("TV is turned ON");
        } else if (state.equalsIgnoreCase("OFF")) {
            System.out.println("TV is turned OFF");
        }
    }

    public static void main(String[] args) {
        TvRemoteBasic remote = new TvRemoteBasic();
        remote.setState("ON");
        remote.doAction();

        remote.setState("OFF");
        remote.doAction();
    }
    //Notice that client code should know the specific values to use for setting the state of remote. Further
    //more if number of states increase then the tight coupling(highly dependent on each other) between implementation
    // and the client code will be very hard to maintain and exted. Now we will use State pattern to implement above
    // TV Remote example.
}
