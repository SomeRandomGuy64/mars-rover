package marsrover.CardinalDirections;

import marsrover.Coordinate;
import marsrover.Direction;

public class North implements Direction{

	@Override
	public Direction turnLeft() {
		return new West();
	}

	@Override
	public Direction turnRight() {
		return new East();
	}

	@Override
	public Coordinate moveForward(Coordinate current) {
		return new Coordinate(current.getXPosition(), current.getYPosition() + 1);
	}

	@Override
	public void printDirection() {
		System.out.println(" N");
	}

}
