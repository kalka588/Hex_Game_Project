package ihm.IInput;

import java.util.Scanner;

public class Input implements Iinput {

	@Override
	public String askNamePlayer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quel est le nom du joueur ?");
		return sc.next();
	}

	@Override
	public String askColorPlayer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quel est la couleur (b ou r) du joueur ?");
		return sc.next();
	}

	@Override
	public int askXpos() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer la colonne");	
		return sc.nextInt();
	}

	@Override
	public int askYpos() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer la ligne");	
		return sc.nextInt();
	}

}
