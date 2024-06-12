# Composite

Composite consists of following objects.

- Base Component - Base component is the interface for all objects in the composition, client program uses base component to work with the objects in the composition. It can be an interface or an abstract class with some methods common to all the objects.
- Leaf - Defines the behaviour for the elements in the composition. It is the building block for the composition and implements base component. It doesn’t have references to other Components.
- Composite - It consists of leaf elements and implements the operations in base component.
> Composite also implements component and behaves similar to leaf except that it can contain group of leaf elements.

> * Composite pattern should be applied only when the group of objects should behave as the single object.
>* Composite design pattern can be used to create a tree like structure.
### Example
* Shapes : Base Component
* Triangle : Leaf 
* Drawing : Composite

          +-------------------+
          |      Shapes       |<-- Base Component
          +-------------------+
                  ^
                  |
          +-------------------+
          |     Drawing       |<-- Composite
          |   +--------------+|
          |   | Triangle     |<-- Leaf
          |   +--------------+|
          |   | OtherShape   |<-- Leaf
          |   +--------------+|
          |                   |
          +-------------------+
