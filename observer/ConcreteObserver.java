package observer;

public class ConcreteObserver implements Observer, DisplayElement {
    private Subject weatherData;
    private float temperature;
    private float humidity;

    public ConcreteObserver(Subject s){
        this.weatherData = s;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature +
                "F degrees and" + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
