package CommandPattern;

/**
 * 遥控器类，具有多个按钮
 * 
 * @author he
 *
 */
public class RemoteControlWithUndo {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;

	public RemoteControlWithUndo() {
		onCommands = new Command[7];
		offCommands = new Command[7];

		Command noCommand = new NoCommand();

		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}

	/**
	 * 
	 * @param slot
	 *            按钮的位置
	 * @param onCommand
	 * @param offCommand
	 */
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}

	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}

	/**
	 * 撤销
	 */
	public void undoButtonWasPushed() {
		undoCommand.undo();
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
