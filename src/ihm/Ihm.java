package ihm;

import java.util.Scanner;

import pieces.Piece;

public class Ihm implements Iihm {

	@Override
	public String askNamePlayer(int numJ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quel est le nom du joueur " + numJ + " ?");
		return sc.next();
	}

	@Override
	public String askColorPlayer(int numJ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quel est la couleur (b ou r) du joueur " + numJ + " ?");
		return sc.next();
	}

	@Override
	public int askXpos(String namePlayer) {
		Scanner sc = new Scanner(System.in);
		System.out.println(namePlayer + " entrez la colonne");	
		return sc.nextInt();
	}

	@Override
	public int askYpos(String namePlayer) {
		Scanner sc = new Scanner(System.in);
		System.out.println(namePlayer + " entrez la ligne");	
		return sc.nextInt();
	}

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
