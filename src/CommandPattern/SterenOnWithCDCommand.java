package CommandPattern;

public class SterenOnWithCDCommand implements Command {

	Stereo stereo;

	public SterenOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}

}
