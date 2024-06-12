package gof.structural.proxy;

//This interface will be implemented by both the actual remote service and our proxy.
public interface WeatherService {
    String getWeather(String city);
}
