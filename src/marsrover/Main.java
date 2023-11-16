package marsrover;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		validateUserInput();
		
//		calculateRoverDestination();
		
//		outputRoverDestination();
	}
	
	public static void validateUserInput() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the maximum size of the plateau: ");
		
		int xSize = scanner.nextInt();
		int ySize = scanner.nextInt();
		
		Plateau plateau = new Plateau(xSize, ySize);
				
		System.out.println("The plateau size is: " + plateau.xSize + " " + plateau.ySize);
		System.out.println("Enter rover instructions");
		
		while(true) {
			String roverInstructionsInput = scanner.nextLine();
			
			if (roverInstructionsInput.equalsIgnoreCase("exit")) {
				break;
			}
			
			int roverXPosition = scanner.nextInt();
			int roverYPosition = scanner.nextInt();
			char roverDirection = scanner.next().charAt(0);
			char[] roverInstructions = roverInstructionsInput.toCharArray();			
		}
		
		scanner.close();
	}
	
	public static void calculateRoverDestination() {
		
	}
	
	public static void outputRoverDestination() {
		
	}
	
}
