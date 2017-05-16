package ObserverPattern;

/**
 * Ä³¸ö¹Û²ìÕß
 * 
 * @author he
 *
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private float pressure;

	private Subject weatherData;

	public CurrentConditionsDisplay(Subject subject) {
		weatherData = subject;
		weatherData.registerObserver(this);

	}

	public void unRegister() {
		weatherData.removeObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + " F degrees and " + humidity + " % humidity");
	}

}
