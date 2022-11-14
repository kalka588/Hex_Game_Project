package ihm;

import plateau.Plateau;
import player.Player;

public class Hex {
	private Iihm ihm;
	private int taille;
	private int nbPlayers;
	Player[] gPlayers;
	private Plateau plateau;
	
	public Hex(int taille, int nbPlayers, Iihm ihm) {
		this.taille = taille;
		this.nbPlayers = nbPlayers;
		this.ihm = ihm;
		this.plateau = new Plateau(this.taille);
	}
	
	public void play() {
		createPlayers();
		this.plateau.init();
		this.ihm.affiche(this.plateau.getPlateau());	
		//while
		for(int i = 0; i < this.gPlayers.length; ++i) {
			int x = this.ihm.askXpos(gPlayers[i].getName());
			int y = this.ihm.askYpos(gPlayers[i].getName());
			// Tests sur x et y
			this.plateau.place(x, y, gPlayers[i].place(x, y));
			this.ihm.affiche(this.plateau.getPlateau());	
		}
		
	}
	
	private void createPlayers() {
		gPlayers = new Player[this.nbPlayers];
		for(int i = 0; i < gPlayers.length; ++i) {
			gPlayers[i] = new Player(ihm.askNamePlayer(i+1), ihm.askColorPlayer(i+1), this.taille);
		}
	}
}
