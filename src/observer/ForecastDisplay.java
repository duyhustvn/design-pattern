package src.observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 41f;
    private float lastPressure;

    public ForecastDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    public void display() {
        System.out.print("Forecast Display: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improve weather on the way");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else {
            System.out.println("Watchout for the cooler, rainy weather");
        }
    }
}
