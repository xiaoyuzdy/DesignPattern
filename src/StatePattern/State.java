package StatePattern;
 
/**
 * ״̬�ӿڣ�ÿ��״̬��Ҫʵ�ָýӿ�
 * ������״̬��
 * 1����������
 * 2������
 * 3���������Ǯ����
 * 4���������Ǯ��
 * @author he
 *
 */
public interface State {
  public void insertQuarter();
  public void ejectQuarter();
  public void turnCrank();
  public void dispense();
}
