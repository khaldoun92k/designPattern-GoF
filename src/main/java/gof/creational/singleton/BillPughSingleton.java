package gof.creational.singleton;

public class BillPughSingleton {
/**
 * This is the most widely used approach
 * **/
    private BillPughSingleton(){}

    // SingletonHelper class is not loaded into memory and only when someone calls the getInstance()
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
