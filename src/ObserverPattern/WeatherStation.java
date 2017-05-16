package ObserverPattern;

/**
 * ≤‚ ‘¿‡
 * 
 * @author he
 *
 */
public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay cDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(50, 40, 30);
		cDisplay.unRegister();
		weatherData.setMeasurements(30, 10, 29);
	}
}
