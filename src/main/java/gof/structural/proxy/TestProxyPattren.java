package gof.structural.proxy;

public class TestProxyPattren {
    public static void main(String[] args) {
        WeatherService actualService = new ActualWeatherService();
        WeatherService proxy = new WeatherServiceProxy(actualService);

        System.out.println(proxy.getWeather("New York"));
        System.out.println(proxy.getWeather("Los Angeles"));
        System.out.println(proxy.getWeather("New York")); // Should be served from cache
    }
}
