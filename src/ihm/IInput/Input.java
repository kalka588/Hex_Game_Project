package ihm.IInput;

import java.util.Scanner;

public class Input implements Iinput {

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

}
