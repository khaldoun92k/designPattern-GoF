# Abstract Factory

The principle is to have a factory class for each subclass. Then an Abstract Factory class that will return the subclass based on the input factory class.
### Example
Abstract class Computer with two subclasses PC and Server:

                               +--------------------------------------------------+
                               |                                                 |
                               |                  ComputerFactory                |
                               +--------------------------------------------------+
                                    |                                               
                                    |                                               
                                    V                                               
                        +--------------------------------------+          
                        | ComputerAbstractFactory              |            
                        |                                      |             
                        +--------------------------------------+________________________________________
                        |                                       |                                       |
                        |                                       |                                       |
                        V                                       V                                       V
    +----------------------------------+     +----------------------------------+     +----------------------------------+
    | PCFactory                        |     | ServerFactory                     |    | OtherComputerFactory             |
    +----------------------------------+     +----------------------------------+     +----------------------------------+
        |                                            |                                     |
        |                                            |                                     |
        V                                            V                                     V
    +-----------------------------------+   +-----------------------------------+   +-----------------------------------+
    | Computer                          |   | Computer                          |    | Computer                         |
    +-----------------------------------+   +-----------------------------------+   +-----------------------------------+
            |                                     |                                     |
            |                                     |                                     |
            V                                     V                                     V
    +-----------------------------------+   +-----------------------------------+   +-----------------------------------+
    | PC                                |     | Server                          |   | Laptop                           |
    +-----------------------------------+   +-----------------------------------+   +-----------------------------------+


## Abstract Factory Design Pattern Benefits
- Abstract Factory design pattern provides approach to code for interface rather than implementation.
- Abstract Factory pattern is “factory of factories” and can be easily extended to accommodate more products, for example we can add another sub-class Laptop and a factory LaptopFactory.
- Abstract Factory pattern is robust and avoid conditional logic of Factory pattern.