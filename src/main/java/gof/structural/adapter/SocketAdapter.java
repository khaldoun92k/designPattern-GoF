package gof.structural.adapter;

//Adapter that can produce 3 volts, 12 volts and default 120 volts.
public interface SocketAdapter {

    public Volt get120Volt();

    public Volt get12Volt();

    public Volt get3Volt();
}
