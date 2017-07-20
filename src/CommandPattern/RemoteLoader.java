package CommandPattern;
/**
 * ≤‚ ‘¥˙¬Î
 * @author he
 *
 */
public class RemoteLoader {
	public static void main(String[] args) {
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		Light light = new Light();
		Stereo stereo = new Stereo();

		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);

		SterenOnWithCDCommand sterenOnWithCDCommand = new SterenOnWithCDCommand(stereo);
		SterenOffWithCDCommand sterenOffWithCDCommand = new SterenOffWithCDCommand(stereo);

		remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
		remoteControl.setCommand(1, sterenOnWithCDCommand, sterenOffWithCDCommand);
		System.out.println(remoteControl);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.undoButtonWasPushed();
		
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.undoButtonWasPushed();
		
		
		

	}

}
