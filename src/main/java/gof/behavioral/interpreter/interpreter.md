# Interpreter
The Interpreter design pattern defines the grammar of a particular language in an object-oriented way which can be evaluated by the interpreter itself.

### Example 
Expression interpreter with AND OR and TERMINAL expressions

![img-interpreter.png](https://www.tutorialspoint.com/design_pattern/images/interpreter_pattern_uml_diagram.jpg)

### Downsides
When the grammar is getting more complex, it becomes harder to maintain.

It can be seen in the presented example. It’d be reasonably easy to add another expression, yet it won’t be too easy to maintain if we’d decide to keep extending it with all other expressions.