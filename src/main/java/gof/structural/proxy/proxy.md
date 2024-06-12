# Proxy 

Provide a surrogate or placeholder for another object to control access to it.

### Example 
Weather Service : the Actual Weather Service implementation is called via a Proxy That adds a caching mechanism to the weather service:


                                +------------------+
                                |  WeatherService  |
                                +------------------+
                                    /        \  
                                   /          \
                +----------------------+    +----------------------+
                | ActualWeatherService |    | WeatherServiceProxy  |->adds cashing 
                +----------------------+    +----------------------+
                                                ^
                                                |
                                         +-------------+
                                         |    Client   |
                                         +-------------+