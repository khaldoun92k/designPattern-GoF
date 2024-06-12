# Prototype

Prototype design pattern is used when the Object creation is a costly affair and requires a lot of time and resources and you have a similar object already existing. 

Prototype pattern provides a mechanism to copy the original object to a new object and then modify it according to our needs. Prototype design pattern uses java cloning to copy the object.

> Prototype design pattern mandates that the Object which you are copying should provide the copying feature. It should not be done by any other class


### Example
Clone existing Employee into a new object and then do the data manipulation. 

> If the object cloning was not provided, we will have to make database call to fetch the employee list every time. Then do the manipulations that would have been resource and time consuming.
