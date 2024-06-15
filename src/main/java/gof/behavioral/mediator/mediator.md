# Mediator

Mediator design pattern is used to provide a centralized communication medium between different objects in a system.


Allows loose coupling by encapsulating the way disparate sets of objects interact and communicate with each other. Allows for the actions of each object set to vary independently of one another.

### Example 
Air traffic controller; chat mediator between flights:

![img-mediator.png](https://journaldev.nyc3.cdn.digitaloceanspaces.com/2013/07/mediator-pattern.png)

### Mediator Design Pattern Important Points
- Mediator pattern is useful when the communication logic between objects is complex, we can have a central point of communication that takes care of communication logic.
- Java Message Service (JMS) uses Mediator pattern along with Observer pattern to allow applications to subscribe and publish data to other applications.
- We should not use mediator pattern just to achieve lose-coupling because if the number of mediators will grow, then it will become hard to maintain them.

