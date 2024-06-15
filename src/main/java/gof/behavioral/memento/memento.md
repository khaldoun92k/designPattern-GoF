# Memento
The Memento design pattern is a behavioral design pattern used to capture and restore the internal state of an object without exposing its implementation details.

### Example 
Document History

![img-mediator.png](https://media.geeksforgeeks.org/wp-content/uploads/20240604120300/1-(1).webp)
### When to use Memento Design Pattern
- Undo functionality: When you need to implement an undo feature in your application that allows users to revert changes made to an object’s state.
- Snapshotting: When you need to save the state of an object at various points in time to support features like versioning or checkpoints.
- Transaction rollback: When you need to rollback changes to an object’s state in case of errors or exceptions, such as in database transactions.
- Caching: When you want to cache the state of an object to improve performance or reduce redundant computations.
### When not to use Memento Design Pattern
- Large object state: If the object’s state is large or complex, storing and managing multiple snapshots of its state can consume a significant amount of memory and processing resources.
- Frequent state changes: If the object’s state changes frequently and unpredictably, storing and managing snapshots of its state may become impractical or inefficient.
- Immutable objects: If the object’s state is immutable or easily reconstructible, there may be little benefit in using the Memento pattern to capture and restore its state.
- Overhead: Introducing the Memento pattern can add complexity to the codebase, especially if the application does not require features like undo functionality or state rollback.