package pieces;

public class Piece {
	private String color="";
	private int x;
	private int y;
	
	public Piece(String color, int x, int y) {
		this.color = color;
		this.x = x;
		this.y =y ;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
}
