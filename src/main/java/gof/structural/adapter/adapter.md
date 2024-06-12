# Adapter
Adapter design patter is used so that two unrelated interfaces can work together. The object that joins these unrelated interface is called an Adapter.

### Example
Create an adapter between two classes - Volt (to measure volts) and Socket (producing constant volts of 120V).
2 Types of Implementation;

           +---------+
           |  Socket |
           +---------+
               ^
               |
              0..1
               |
           +----------------+
           | SocketAdapter  |
           +----------------+
              /         \
             /           \
            /             \
    +-------------------+   +--------------------+
    | SocketClassAdapter|   | SocketObjectAdapter|
    |        Impl       |   |         Impl       |
    +-------------------+   +--------------------+