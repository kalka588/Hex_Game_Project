package player;

import pieces.Piece;

public class Player {
	private String color ="";
	private String name ="";
	private Piece[] pPieces;
	private int index;
	
	public Player(String name, String color, int taille) {
		this.name = name;
		this.color = color;
		this.pPieces = new Piece[taille*taille];
		this.index = 0;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public Piece place(int x, int y) {
		Piece p = new Piece(this.color, x, y);
		this.pPieces[this.index] = p;
	    ++this.index;
		return p;
	}
}
