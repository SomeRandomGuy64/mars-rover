package marsrover.CommandClasses;

import marsrover.Rover;
import marsrover.RoverCommand;

public class MoveForwardCommand implements RoverCommand{

	@Override
	public void execute(Rover rover) {
		rover.moveForward();
	}

}
