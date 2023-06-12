package observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        ConcreteObserver currentDisplay = new ConcreteObserver(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);

    }
}
