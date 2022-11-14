package plateau;

import pieces.Piece;
import player.Player;

public class Plateau {
	private int taille;
	private Piece[][] plateau;
	
	public Plateau(int taille) {
		this.taille = taille;
		this.plateau = new Piece[this.taille][this.taille];
	}
	
	public void init() {
		for(int y = 0; y < this.taille; ++y) {
			for(int x = 0; x < this.taille; ++x) {
				this.plateau[y][x] = null;
			}
		}
	}
	
	public Piece[][] getPlateau() {
		return this.plateau;
	}
	
	public void place(int x, int y, Piece p) {
		this.plateau[y][x] = p;
	}
}
