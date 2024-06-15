# Observer
Observer design pattern is useful when you are interested in the state of an object and want to get notified whenever there is any change.
In observer pattern, the object that watch on the state of another object are called Observer and the object that is being watched is called Subject.

>Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

### Example
Observer Subject Notification

Whenever any new message will be posted to the topic, all the registers observers will be notified and they can consume the message.


![img-observer.png](https://journaldev.nyc3.cdn.digitaloceanspaces.com/2013/07/observer-pattern.png)