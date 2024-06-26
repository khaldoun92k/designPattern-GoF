package gof.creational.factory;

/**
 * Keep Factory class Singleton, or keep the method that returns the subclass as static=> Provides a single access point for object creation, centralizing control.
 * Based on the input parameter, different subclass is created and returned. getComputer is the factory method.
 * **/
public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);

        return null;
    }
}
