package CommandPattern;

/**
 * ֻ��һ����ť��ң����
 * 
 * @author he
 *
 */
public class SimpleRemoteControl {
	Command slot;

	public SimpleRemoteControl() {
		// TODO Auto-generated constructor stub
	}

	public void setCommand(Command command) {
		slot = command;
	}

	public void buttonWasPressed() {
		slot.execute();
	}
}
