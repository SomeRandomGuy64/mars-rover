package marsrover;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		InstructionsProcessor instructionsProcessor = getUserInput();
		
		instructionsProcessor.updateRoverLocation();
		
		outputRoverDestination(instructionsProcessor);
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
			
			Rover rover = new Rover(roverXPosition, roverYPosition, roverDirection, roverInstructions);
			rovers.add(rover);
		}
		
		scanner.close();
		
		InstructionsProcessor instructionsProcessor = new InstructionsProcessor(rovers, plateau);
		return instructionsProcessor;
	}
	
	public static void outputRoverDestination(InstructionsProcessor instructionsProcessor) {
		for (Rover rover : instructionsProcessor.getRovers()) {
			System.out.println(rover.getXPosition() + " " + rover.getYPosition() + " " + rover.getDirection() + "\n");
		}
	}
}