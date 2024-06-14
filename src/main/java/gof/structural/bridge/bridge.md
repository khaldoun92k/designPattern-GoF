# Bridge
Decouple an abstraction from its implementation so that the two can vary independently

### Example 1
Shapes and color
* UML before Bridge

![img-pre-bridge.png](https://journaldev.nyc3.cdn.digitaloceanspaces.com/2013/07/Bridge-Interface-Hierarchy.png)
* UML after Bridge

![img-post-bridge.png](https://journaldev.nyc3.cdn.digitaloceanspaces.com/2013/07/bridge-design-pattern.png)

### Example 2
*Pre-Bridge* 

    +-----------------+                +--------------------+
    | RemoteControl   |                | TV                 |
    |-----------------|                |--------------------|
    | - on()          |                | - turnOn()         |
    | - off()         |                | - turnOff()        |
    | - setChannel()  |                | - setChannel(int)  |
    +-----------------+                +--------------------+
            |                                   |
            |                                   |
            v                                   v
    +------------------+                  +---------------------+
    | TVRemoteControl  |                  | Radio               |
    |------------------|                  |---------------------|
    | - on()           |                  | - turnOn()          |
    | - off()          |                  | - turnOff()         |
    | - setChannel()   |                  | - setFrequency()    |
    +------------------+                  +---------------------+

*Post-Bridge*

    +-----------------+                +--------------------+
    | RemoteControl   |<-------------->| Device             |
    |-----------------|                |--------------------|
    | - device: Device|                | + turnOn()         |
    | + turnOn()      |                | + turnOff()        |
    | + turnOff()     |                | + setChannel(int)  |
    | + setChannel()  |                +--------------------+
    +-----------------+                       /  \
            |                                /    \
            v                               /      \
    +---------------------+        +----------------+ +----------------+
    | BasicRemoteControl  |        | TV             | | Radio          |
    |---------------------|        |----------------| |----------------|
    | + turnOn()          |        | + turnOn()     | | + turnOn()     |
    | + turnOff()         |        | + turnOff()    | | + turnOff()    |
    | + setChannel()      |        | + setChannel() | | + setChannel() |
    +---------------------+        +----------------+ +----------------+

Device :Implementor Interface => contains method declarations that the concrete implementor classes must implement. These methods are typically operations that the abstraction will use to perform its high-level operations.

>The bridge between Shape and Color interfaces and use of composition in implementing the bridge pattern.

> Bridge design pattern can be used when both abstraction and implementation can have different hierarchies independently and we want to hide the implementation from the client application 