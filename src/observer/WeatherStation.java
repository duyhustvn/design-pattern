package src.observer;

public class WeatherStation {
    public static void main(String []args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(30, 80, 40);
        weatherData.setMeasurements(31, 81, 41);
        weatherData.setMeasurements(32, 82, 42);
    }
}
