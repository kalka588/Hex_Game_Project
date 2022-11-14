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
		setVoisins(p);
		this.pPieces[this.index] = p;
	    ++this.index;
		return p;
	}
	
	private void setVoisins(Piece np) {
		for(Piece p : this.pPieces) {
			if(p != null && Math.abs(p.getX() - np.getX()) <= 1 && Math.abs(p.getY() - np.getY()) <= 1) {
				p.setVoisins(np);
				np.setVoisins(p);
			}
		}
	}

	public boolean win() {
		return lienPossible();
	}

	private boolean lienPossible() {
		return false;
	}
}
