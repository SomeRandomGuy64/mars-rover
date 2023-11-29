package marsrover;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import marsrover.CardinalDirections.East;
import marsrover.CardinalDirections.North;
import marsrover.CardinalDirections.South;
import marsrover.CardinalDirections.West;
import marsrover.CommandClasses.MoveForwardCommand;
import marsrover.CommandClasses.TurnLeftCommand;
import marsrover.CommandClasses.TurnRightCommand;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		InstructionsProcessor processor = getUserInput();
		
		processor.updateRoverLocation();
		
		outputRoverPosition(processor);
//		Rover rover = new Rover(new Coordinate(1, 2), new North());
//		RoverController controller = new RoverController();
//		Plateau plateau = new Plateau(5, 5);
//		
//		controller.setCommand(new MoveForwardCommand());
//		controller.executeCommand(rover);
//		
//		controller.setCommand(new MoveForwardCommand());
//		controller.executeCommand(rover);
//		
//		controller.setCommand(new MoveForwardCommand());
//		controller.executeCommand(rover);
//		
//		controller.setCommand(new MoveForwardCommand());
//		controller.executeCommand(rover);
//		
//		controller.setCommand(new TurnRightCommand());
//		controller.executeCommand(rover);
//		
//		plateau.checkWithinPlateau(rover.getCoordinate());
//		
//		System.out.print("Rover's final position: ");
//		rover.getCoordinate().printPosition();
//		System.out.print("Rover's final direction: ");
//		rover.getDirection().printDirection();
	}
	
	public static InstructionsProcessor getUserInput() throws FileNotFoundException {
		String filepath = ("src/resources/input.txt");
		File file = new File(filepath);
		
		Scanner scanner = new Scanner(file);

		int xSize = scanner.nextInt();
		int ySize = scanner.nextInt();
		
		Plateau plateau = new Plateau(xSize, ySize);
		
		ArrayList<Rover> rovers = new ArrayList<>();
		
		while(scanner.hasNextLine()) {			
			int roverXPosition = scanner.nextInt();
			int roverYPosition = scanner.nextInt();
			char roverDirection = scanner.next().charAt(0);
			scanner.nextLine();
			String roverInstructionsInput = scanner.nextLine();
			char[] roverInstructions = roverInstructionsInput.toCharArray();
			
			Rover rover = createRover(roverXPosition, roverYPosition, roverDirection, roverInstructions);
			rovers.add(rover);
		}
		
		scanner.close();
		
		InstructionsProcessor instructionsProcessor = new InstructionsProcessor(rovers, plateau);
		return instructionsProcessor;
	}
	
	public static Rover createRover(int roverXPosition, int roverYPosition, char direction, char[] instructions) {
		Rover rover = null;
		
		switch(direction) {
		case 'N':
			rover = new Rover(new Coordinate(roverXPosition, roverYPosition), new North(), instructions);
			break;
		case 'E':
			rover = new Rover(new Coordinate(roverXPosition, roverYPosition), new East(), instructions);
			break;
		case 'S':
			rover = new Rover(new Coordinate(roverXPosition, roverYPosition), new South(), instructions);
			break;
		case 'W':
			rover = new Rover(new Coordinate(roverXPosition, roverYPosition), new West(), instructions);
			break;
		default:
			break;
		}
		
		return rover;
	}
	
	public static void outputRoverPosition(InstructionsProcessor processor) {
		for (Rover rover : processor.getRovers()) {
			rover.getCoordinate().printPosition();
			rover.getDirection().printDirection();
		}
	}
}