package ObserverPattern;
/**
 * ����Ľӿ�
 * @author he
 *
 */
public interface Subject {
	public void registerObserver( Observer o);
	public void removeObserver( Observer o);
	public void notifyObserver();//����״̬�ı�ʱ���÷�������
}
