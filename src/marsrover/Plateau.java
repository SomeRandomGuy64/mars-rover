package marsrover;

public class Plateau {
	private int xSize;
	private int ySize;
	
	public Plateau(int xSize, int ySize) {
		this.xSize = xSize;
		this.ySize = ySize;
	}
	
	public int getXSize() {
		return this.xSize;
	}
	
	public int getYSize() {
		return this.ySize;
	}
	
	public Coordinate checkWithinPlateau(Coordinate coordinate) {
		if (coordinate.getXPosition() > getXSize()) {
			coordinate.setXPosition(getXSize());
		}
		
		if (coordinate.getYPosition() > getYSize()) {
			coordinate.setYPosition(getYSize());
		}
		return coordinate;
	}
}