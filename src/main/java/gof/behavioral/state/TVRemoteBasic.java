package gof.behavioral.state;

public class TVRemoteBasic {
    private String state = "";

    public void setState(String state) {
        this.state = state;
    }

    public void doAction() {
        if (state.equalsIgnoreCase("ON")) {
            System.out.println("TV is turned ON");
        } else if (state.equalsIgnoreCase("OFF")) {
            System.out.println("TV is turned OFF");
        }
    }
    //the client code should know the specific values to use for setting the state of remote.
    //tight coupling between implementation and the client code will be very hard to maintain and extend.
    public static void main(String[] args) {
        TVRemoteBasic remote = new TVRemoteBasic();

        remote.setState("ON");
        remote.doAction();

        remote.setState("OFF");
        remote.doAction();
    }
}
