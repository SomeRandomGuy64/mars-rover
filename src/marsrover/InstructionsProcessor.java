package marsrover;

import java.util.ArrayList;

import marsrover.CommandClasses.MoveForwardCommand;
import marsrover.CommandClasses.TurnLeftCommand;
import marsrover.CommandClasses.TurnRightCommand;

public class InstructionsProcessor {
	private ArrayList<Rover> rovers;
	private Plateau plateau;
	private RoverController controller = new RoverController();
	
	public InstructionsProcessor(ArrayList<Rover> rovers, Plateau plateau) {
		this.rovers = rovers;
		this.plateau = plateau;
	}
	
	public ArrayList<Rover> getRovers() {
		return this.rovers;
	}
	
	public void updateRoverLocation() {
		for (Rover rover : rovers) {
			for (char instruction : rover.getInstructions()) {
				switch (instruction) {
				case 'L':
					controller.setCommand(new TurnLeftCommand());
					controller.executeCommand(rover);
					break;
					
				case 'R':
					controller.setCommand(new TurnRightCommand());
					controller.executeCommand(rover);
					break;
					
				case 'M':
					controller.setCommand(new MoveForwardCommand());
					controller.executeCommand(rover);
					break;
				}
			}
			plateau.checkWithinPlateau(rover.getCoordinate());
		}
	}
}