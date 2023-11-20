package marsrover.CommandClasses;

import marsrover.Rover;
import marsrover.RoverCommand;

public class TurnLeftCommand implements RoverCommand{

	@Override
	public void execute(Rover rover) {
		rover.turnLeft();
	}

}
