package CommandPattern;

/**
 * ң�����࣬���ж����ť
 * 
 * @author he
 *
 */
public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;

	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];

		Command noCommand = new NoCommand();

		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}

	/**
	 * 
	 * @param slot
	 *            ��ť��λ��
	 * @param onCommand
	 * @param offCommand
	 */
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}

	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}

	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\n---- Remote Control -----\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuffer.append("[slot" + i + "]" + onCommands[i].getClass().getName() + "    "
					+ offCommands[i].getClass().getName() + "\n");
		}
		return stringBuffer.toString();
	}

}
