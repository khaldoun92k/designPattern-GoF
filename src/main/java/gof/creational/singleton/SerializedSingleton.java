package gof.creational.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    private static final long serialVersionUID = -7604766932017737115L;

    // Private constructor to prevent instantiation
    private SerializedSingleton(){}
    //BillPughSingleton
    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }

    // readResolve method to preserve singleton property
    protected Object readResolve() {
        return getInstance();
    }
}
