package gof.creational.abstractFactory;

public class TestAbstractFactory {

    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        Computer laptop = ComputerFactory.getComputer(new LaptopFactory("4 GB","250 GB","2.8 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
        System.out.println("AbstractFactory PC Config::"+pc);
        System.out.println("AbstractFactory laptop Config::"+laptop);
        System.out.println("AbstractFactory Server Config::"+server);
    }
}
