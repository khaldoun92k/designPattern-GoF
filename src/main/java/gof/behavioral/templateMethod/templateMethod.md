# Template Method
Template Method is a behavioral design pattern.
Template Method design pattern is used to create a method stub and deferring some of the steps of implementation to the subclasses.
### Example 
Build House Template ; wooden or glass house

![img-template.png](https://journaldev.nyc3.cdn.digitaloceanspaces.com/2013/07/template-method-pattern.png)

>the template method, final so subclasses can't override

### Template Method Design Pattern Important Points
- Template method should consists of certain steps whose order is fixed and for some of the methods, implementation differs from base class to subclass. Template method should be final.
- Most of the time, subclasses calls methods from super class but in template pattern, *superclass template method calls methods from subclasses* , this is known as Hollywood Principle - “don’t call us, we’ll call you.”.
- Methods in base class with default implementation are referred as Hooks, and they are intended to be overridden by subclasses, if you want some of the methods to be not overridden, you can make them final, for example in our case we can make buildFoundation() method final because if we don’t want subclasses to override it.
That's all for template method design pattern in java, I hope you liked it.