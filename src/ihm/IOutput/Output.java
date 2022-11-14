package ihm.IOutput;

import pieces.Piece;
import plateau.Plateau;

public class Output implements Ioutput {

	@Override
	public void affiche(Piece[][] plat) {
		String s = ligne(plat.length) + "\n" + colonne(plat) + ligne(plat.length);
		System.out.println(s);
	}
	
	private String ligne(int taille) {
		String s =" ";
		for (int i = 0; i < taille; ++i) {
			s += " r ";
		}
		return s;
	}
	
	private String colonne(Piece[][] plat) {
		String s = "";
		String decal ="";
		for(Piece[] x : plat) {
			s += decal + "b";
			for(Piece y : x) {
				s += " ";
				if(y != null) {
					s += y.getColor();
				} else {
					s += ".";
				}
				s += " ";
			}
			s += "b\n";
			decal += " ";
		}
		s += decal;
		return s;
	}

}
