package marsrover;

public class RoverController {
	private RoverCommand command;
	
	public void setCommand(RoverCommand command) {
		this.command = command;
	}
	
	public void executeCommand(Rover rover) {
		command.execute(rover);
	}
}
