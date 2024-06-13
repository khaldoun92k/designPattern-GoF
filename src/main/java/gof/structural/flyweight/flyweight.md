# Flyweight

Use sharing to support large numbers of fine-grained objects efficiently

Flyweight design pattern can be applied to reduce the load on memory by sharing objects.

* The number of Objects to be created by application should be huge.
* The object creation is heavy on memory and it can be time consuming too.
* The object properties can be divided into intrinsic and extrinsic properties, extrinsic properties of an Object should be defined by the client program.

>Divide Object property into intrinsic and extrinsic


### Example 
A Drawing client for Lines and Ovals

#### Flyweight Interface : Shape
##### Purpose:

* Defines the methods that all concrete flyweights must implement.
##### Responsibility:

* Ensures a uniform interface for different flyweight objects.
* Typically, includes operations that take extrinsic state as arguments.

#### Concrete Flyweight : Oval , Line
##### Purpose:

* Defines the methods that all concrete flyweights must implement.
##### Responsibility:

* Stores intrinsic state (shared data) that is invariant across different instances.
* Implements methods defined in the Flyweight interface, using both intrinsic and extrinsic states.

#### Flyweight Factory : ShapeFactory
##### Purpose:

* Manages the creation and sharing of flyweight objects.
##### Responsibility:

* Maintains a pool of flyweight objects.
* Ensures that flyweights are reused by checking if an existing flyweight can be returned instead of creating a new one.
* Provides access to flyweight objects.

#### Client : DrawingClient
##### Purpose:

* Uses flyweight objects and provides the extrinsic state.
##### Responsibility:

* Maintains references to flyweight objects.
* Computes or stores the extrinsic state that is passed to flyweight objects during operations.