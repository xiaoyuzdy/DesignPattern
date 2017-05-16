package ObserverPattern;
/**
 * 主题的接口
 * @author he
 *
 */
public interface Subject {
	public void registerObserver( Observer o);
	public void removeObserver( Observer o);
	public void notifyObserver();//主题状态改变时，该方法调用
}
