package gof.creational.singleton;

/** Creates the instance in the global access method.
 *  it can cause issues if multiple threads are inside the if condition at the same time **/
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
