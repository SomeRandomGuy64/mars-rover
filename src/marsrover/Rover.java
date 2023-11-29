package marsrover;

public class Rover {
	private Coordinate coordinate;
	private Direction direction;
	private char[] instructions;
	
	public Rover(Coordinate coordinate, Direction direction, char[] instructions) {
		this.coordinate = coordinate;
		this.direction = direction;
		this.instructions = instructions;
	}
	
	public void moveForward() {
		coordinate = direction.moveForward(coordinate);
	}
	
	public void turnLeft() {
		direction = direction.turnLeft();
	}
	
	public void turnRight() {
		direction = direction.turnRight();
	}
	
	public Coordinate getCoordinate() {
		return coordinate;
	}
	
	public Direction getDirection() {
		return direction;
	}
	
	public char[] getInstructions() {
		return instructions;
	}
	
	public void setInstructions(char[] instructions) {
		this.instructions = instructions;
	}
}