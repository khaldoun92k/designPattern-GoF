package gof.creational.singleton;



/** Since Java Enum values are globally accessible, so is the singleton.
 * Overcome this situation with Reflection
 * Does not allow lazy initialization
 * **/
public enum EnumSingleton {

    INSTANCE;

    public static void doSomething() {
        // do something
    }
}
