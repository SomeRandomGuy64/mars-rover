package marsrover.CardinalDirections;

import marsrover.Coordinate;
import marsrover.Direction;

public class West implements Direction{

	@Override
	public Direction turnLeft() {
		return new South();
	}

	@Override
	public Direction turnRight() {
		return new North();
	}

	@Override
	public Coordinate moveForward(Coordinate current) {
		return new Coordinate(current.getXPosition() - 1, current.getYPosition());
	}

	@Override
	public void printDirection() {
		System.out.println(" W");
	}
	
}
