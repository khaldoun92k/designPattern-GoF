package gof.creational.singleton;


/**Global access method synchronized so that only one thread can execute this method at a time.**/
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        if (instance == null) {
            //Added *synchronized* for thread-safety ,*synchronized* is not added at the method level to avoid this extra overhead
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

}
