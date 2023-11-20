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
	
	public void checkRoverWithinPlateau(Rover rover) {
		if (rover.getXPosition() > getXSize()) {
			rover.setXPosition(getXSize());
		}
		if (rover.getYPosition() > getYSize()) {
			rover.setYPosition(getYSize());
		}
	}
}