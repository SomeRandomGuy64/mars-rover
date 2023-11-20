package marsrover;

public class Coordinate {
	private int xPosition;
	private int yPosition;
	
	public Coordinate(int xPosition, int yPosition) {
		this.xPosition = xPosition;
		this.yPosition = yPosition;
	}
	
	public int getXPosition() {
		return xPosition;
	}
	
	public int getYPosition() {
		return yPosition;
	}
	
	public void setXPosition(int xPosition) {
		this.xPosition = xPosition;
	}
	
	public void setYPosition(int yPosition) {
		this.yPosition = yPosition;
	}
	
	public void printPosition() {
		System.out.print(xPosition + " " + yPosition);
	}
}
