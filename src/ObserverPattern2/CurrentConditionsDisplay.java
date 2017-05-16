package ObserverPattern2;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer {

	private float temperature;
	private float humidity;
	Observable observable;

	public CurrentConditionsDisplay(Observable observable) {
		// TODO Auto-generated constructor stub
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
		}
	}

}
