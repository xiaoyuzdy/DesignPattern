package CommandPattern;

/**
 * 只有一个按钮的遥控器
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
