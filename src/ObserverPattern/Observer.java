package ObserverPattern;
/**
 * �۲��ߵĽӿ�
 * @author he
 *
 */
public interface Observer {
	/**
	 * 
	 * @param temp  �¶�
	 * @param humidity ʪ��
	 * @param pressure ��ѹ
	 */
	public void update(float temp,float humidity,float pressure);
}
