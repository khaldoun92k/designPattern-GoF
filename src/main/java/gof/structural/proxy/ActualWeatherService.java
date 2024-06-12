package gof.structural.proxy;

//Implement the actual remote service.
public class ActualWeatherService implements WeatherService {
    @Override
    public String getWeather(String city) {
        // Simulate a network call
        System.out.println("Fetching weather data for " + city + " from the actual service...");
        return "Sunny";
    }
}
