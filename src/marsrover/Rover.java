package marsrover;

public class Rover {
	int xPosition;
	int yPosition;
	char direction;
	
	public Rover(int xPosition, int yPosition, char direction) {
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.direction = direction;
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
	
	public void setNewPositionAndDirection(int xPosition, int yPosition, char direction) {
		setXPosition(xPosition);
		setYPosition(yPosition);
		setDirection(direction);
	}
	
	public void printPosition() {
		System.out.println(this.xPosition + " " + this.yPosition + " " + this.direction);
	}
}