package pieces;

public class Piece {
	private String color="";
	private int x;
	private int y;
	private Piece[] voisins = new Piece[6]; //Car max voisin = 6
	private int i = 0;
	
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
	
	public Piece[] getVoisins() {
		return this.voisins;
	}
	
	public void setVoisins(Piece voisin) {
		this.voisins[i] = voisin;
		++this.i;
	}
}
