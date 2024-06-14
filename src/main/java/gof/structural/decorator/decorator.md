# Decorator
Decorator design pattern is used to modify the functionality of an object at runtime. At the same time other instances of the same class will not be affected by this, so individual object gets the modified behavior.

### Important Points
* Decorator design pattern is helpful in providing runtime modification abilities and hence more flexible. Its easy to maintain and extend when the number of choices are more.
* The disadvantage of decorator design pattern is that it uses a lot of similar kind of objects (decorators).
* Decorator pattern is used a lot in Java IO classes, such as FileReader, BufferedReader etc.

### Example 
Car : Basic,Sport,Luxury 

*Pre-Decorator*

![img-pre-decorator.png](https://journaldev.nyc3.cdn.digitaloceanspaces.com/2013/07/inheritance-hierarchy.png)

*Post-Decorator*

![img-post-decorator.png](https://journaldev.nyc3.cdn.digitaloceanspaces.com/2013/07/decorator-pattern-450x312.png)

>Decorator class implements the component interface and it has a HAS-A relationship with the component interface. The component variable should be accessible to the child decorator classes, so we will make this variable protected.
