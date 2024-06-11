# Singleton


## Singleton Pattern Principles:

- Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the
  Java Virtual Machine.
  The singleton class must provide a global access point to get the instance of the class.
- Singleton pattern is used for logging, drivers objects, caching, and thread pool.
- Singleton design pattern is also used in other design patterns like Abstract Factory, Builder, Prototype, Facade, etc.
- Singleton design pattern is used in core Java classes also (for example, java.lang.Runtime, java.awt.Desktop).

## Rules:

- Private constructor to restrict instantiation of the class from other classes.
- Private static variable of the same class that is the only instance of the class.
- Public static method that returns the instance of the class, this is the global access point for the outer world to
  get the instance of the singleton class.

> If comparison between instances is needed compare HashCodes: `instance.hashCode()`

> Reflection (java.lang.reflect) destroys Singleton Pattern !
