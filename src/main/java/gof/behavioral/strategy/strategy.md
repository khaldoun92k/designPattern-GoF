# Strategy
Strategy pattern is used when we have multiple algorithm for a specific task and client decides the actual implementation to be used at runtime.

Also known as Policy Pattern.

### Example
Shopping Cart with two payment strategies

![img-strategy.png](https://journaldev.nyc3.cdn.digitaloceanspaces.com/2013/07/Strategy-Pattern.png)

>We have to use the strategy as an argument to the method,and not use composition (i.e., making the strategy an instance variable of the context class)

### Strategy Design Pattern Important Points
- We could have used composition to create instance variable for strategies, but we should avoid that as we want the specific strategy to be applied for a particular task. Same is followed in Collections.sort() and Arrays.sort() method that take comparator as argument.
- Strategy Pattern is very similar to State Pattern. One of the difference is that Context contains state as instance variable and there can be multiple tasks whose implementation can be dependent on the state whereas in strategy pattern strategy is passed as argument to the method and context object doesn’t have any variable to store it.
- Strategy pattern is useful when we have multiple algorithms for specific task, and we want our application to be flexible to chose any of the algorithm at runtime for specific task.



