package gof.structural.proxy;

import java.util.HashMap;
import java.util.Map;

//This proxy will manage connections to the actual service, potentially adding features like caching or error handling.
public class WeatherServiceProxy implements WeatherService {
    private WeatherService actualService;
    private Map<String, String> cache = new HashMap<>();

    public WeatherServiceProxy(WeatherService actualService) {
        this.actualService = actualService;
    }

    @Override
    public String getWeather(String city) {
        // Check cache first
        if (cache.containsKey(city)) {
            System.out.println("Returning cached weather data for " + city);
            return cache.get(city);
        } else {
            // If not in cache, fetch from actual service and cache the result
            String weatherData = actualService.getWeather(city);
            cache.put(city, weatherData);
            System.out.println("Fetched and cached weather data for " + city);
            return weatherData;
        }
    }
}
