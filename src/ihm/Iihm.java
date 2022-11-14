package ihm;

import pieces.Piece;

public interface Iihm {
	public String askNamePlayer(int numJ);
	public String askColorPlayer(int numJ);
	public int askXpos(String namePlayer);
	public int askYpos(String namePlayer);
	public void affiche(Piece[][] plat);
	public void xyErreur();
}
