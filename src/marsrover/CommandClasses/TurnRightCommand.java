package marsrover.CommandClasses;

import marsrover.Rover;
import marsrover.RoverCommand;

public class TurnRightCommand implements RoverCommand{

	@Override
	public void execute(Rover rover) {
		rover.turnRight();
	}

}
