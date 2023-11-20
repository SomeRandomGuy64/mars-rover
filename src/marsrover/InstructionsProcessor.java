package marsrover;

import java.util.ArrayList;

public class InstructionsProcessor {
	private ArrayList<Rover> rovers;
	private Plateau plateau;
	
	public InstructionsProcessor(ArrayList<Rover> rovers, Plateau plateau) {
		this.rovers = rovers;
		this.plateau = plateau;
	}
	
	public ArrayList<Rover> getRovers() {
		return this.rovers;
	}
	
	public void updateRoverLocation() {
		for (Rover rover : rovers) {
			for (char instruction : rover.getRoverInstructions()) {
				switch (instruction) {
				case 'L':
					changeRoverDirectionToLeft(rover);
					break;
					
				case 'R':
					changeRoverDirectionToRight(rover);
					break;
					
				case 'M':
					moveRover(rover);
					break;
				}
			}
		}
	}
	
	public void changeRoverDirectionToLeft(Rover rover) {
		switch (rover.getDirection()) {
		case 'N':
			rover.setDirection('W');
			break;
		
		case 'E':
			rover.setDirection('N');
			break;
			
		case 'S':
			rover.setDirection('E');
			break;
			
		case 'W':
			rover.setDirection('S');
			break;
		}
	}
	
	public void changeRoverDirectionToRight(Rover rover) {
		switch (rover.getDirection()) {
		case 'N':
			rover.setDirection('E');
			break;
		
		case 'E':
			rover.setDirection('S');
			break;
			
		case 'S':
			rover.setDirection('W');
			break;
			
		case 'W':
			rover.setDirection('N');
			break;
		}
	}
	
	public void moveRover(Rover rover) {
		switch (rover.getDirection()) {
		case 'N':
			rover.setYPosition(rover.getYPosition() + 1);
			break;
		
		case 'E':
			rover.setXPosition(rover.getXPosition() + 1);
			break;
			
		case 'S':
			rover.setYPosition(rover.getYPosition() - 1);
			break;
			
		case 'W':
			rover.setXPosition(rover.getXPosition() - 1);
			break;
		}
		
		checkRoverWithinPlateau(rover);
	}
	
	public void checkRoverWithinPlateau(Rover rover) {
		if (rover.getXPosition() > this.plateau.getXSize()) {
			rover.setXPosition(this.plateau.getXSize());
		}
		if(rover.getYPosition() > this.plateau.getYSize()) {
			rover.setYPosition(this.plateau.getYSize());
		}
	}
}