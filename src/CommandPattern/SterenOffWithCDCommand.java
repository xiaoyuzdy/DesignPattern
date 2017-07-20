package CommandPattern;

public class SterenOffWithCDCommand implements Command {

	Stereo sterro;

	public SterenOffWithCDCommand(Stereo stereo) {
		this.sterro = stereo;
	}

	@Override
	public void execute() {
		sterro.off();

	}

	@Override
	public void undo() {
		sterro.on();
		
	}

}
