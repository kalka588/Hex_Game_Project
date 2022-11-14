package ihm;

import ihm.IInput.Iinput;
import ihm.IOutput.Ioutput;
import plateau.Plateau;
import player.Player;

public class Hex {
	private Iinput I;
	private Ioutput O;
	private int taille;
	private int nbPlayers;
	Player[] gPlayers;
	private Plateau plateau;
	
	public Hex(int taille, int nbPlayers, Iinput I, Ioutput O) {
		this.taille = taille;
		this.nbPlayers = nbPlayers;
		this.I = I;
		this.O = O;
		this.plateau = new Plateau(this.taille);
	}
	
	public void play() {
		createPlayers();
		this.plateau.init();
		this.O.affiche(this.plateau.getPlateau());	
		//while
		for(int i = 0; i < this.gPlayers.length; ++i) {
			int x = this.I.askXpos(gPlayers[i].getName());
			int y = this.I.askYpos(gPlayers[i].getName());
			// Tests sur x et y
			//                 x  y                    x  y
			this.plateau.place(x, y, gPlayers[i].place(x, y));
			this.O.affiche(this.plateau.getPlateau());	
		}
		
	}
	
	private void createPlayers() {
		gPlayers = new Player[this.nbPlayers];
		for(int i = 0; i < gPlayers.length; ++i) {
			gPlayers[i] = new Player(I.askNamePlayer(i+1), I.askColorPlayer(i+1), this.taille);
		}
	}
}
