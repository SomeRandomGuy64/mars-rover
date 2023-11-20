package marsrover;

public class Rover {
	private int xPosition;
	private int yPosition;
	private char direction;
	private char[] instructions;
	
	public Rover(int xPosition, int yPosition, char direction, char[] instructions) {
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.direction = direction;
		this.instructions = instructions;
	}
	
	public void setXPosition(int xPosition) {
		this.xPosition = xPosition;
	}
	
	public void setYPosition(int yPosition) {
		this.yPosition = yPosition;
	}
	
	public void setDirection(char direction) {
		this.direction = direction;
	}
	
	public int getXPosition() {
		return this.xPosition;
	}
	
	public int getYPosition() {
		return this.yPosition;
	}
	
	public char getDirection() {
		return this.direction;
	}
	
	public char[] getRoverInstructions() {
		return this.instructions;
	}
	
	public void setNewPositionAndDirection(int xPosition, int yPosition, char direction) {
		setXPosition(xPosition);
		setYPosition(yPosition);
		setDirection(direction);
	}
	
	public void printPosition() {
		System.out.println(this.xPosition + " " + this.yPosition + " " + this.direction + "\n");
	}
}