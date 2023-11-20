package marsrover.CardinalDirections;

import marsrover.Coordinate;
import marsrover.Direction;

public class South implements Direction{

	@Override
	public Direction turnLeft() {
		return new East();
	}

	@Override
	public Direction turnRight() {
		return new West();
	}

	@Override
	public Coordinate moveForward(Coordinate current) {
		return new Coordinate(current.getXPosition() - 1, current.getYPosition());
	}

	@Override
	public void printDirection() {
		System.out.println(" S");
	}

}
