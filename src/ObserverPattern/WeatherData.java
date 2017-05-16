package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题的实现类
 * 
 * @author he
 *
 */
public class WeatherData implements Subject {

	private List<Observer> observerList;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observerList = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observerList.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observerList.indexOf(o);
		if (i >= 0) {
			observerList.remove(o);
		}

	}

	/**
	 * 通知每一个注册的观察者
	 */
	@Override
	public void notifyObserver() {
		for (int i = 0; i < observerList.size(); i++) {
			Observer observer = observerList.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}

	public void measurementsChanged() {
		notifyObserver();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}

	
	
}
