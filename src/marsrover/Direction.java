package marsrover;

public interface Direction {
	Direction turnLeft();
	Direction turnRight();
	Coordinate moveForward(Coordinate current);
	void printDirection();
}
