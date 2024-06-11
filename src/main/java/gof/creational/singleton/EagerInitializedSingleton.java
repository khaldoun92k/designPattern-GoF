package gof.creational.singleton;

/**
 * Eager initialization: The class is created at the time of class loading ;not optimal should avoid the instantiation unless
 * the client calls the getInstance method. Also, this method doesn’t provide any options for exception handling.
 * => not the best practice to use.
 **/
public class EagerInitializedSingleton {
    //Instance loaded into memory
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    // private constructor to avoid client applications using the constructor
    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
