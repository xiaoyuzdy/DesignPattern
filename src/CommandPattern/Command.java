package CommandPattern;

/**
 * ����ӿ�
 * @author he
 *
 */
public interface Command {
	/**
	 * ִ��
	 */
	public void execute();
	
	/**
	 * ����
	 */
	public void undo();
}
