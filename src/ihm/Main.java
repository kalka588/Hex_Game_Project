package ihm;

import ihm.IInput.Input;
import ihm.IOutput.Output;

public class Main {

	public static void main(String[] args) {
		Input I = new Input();
		Output O = new Output();
		Hex game = new Hex(16, 2, I, O);
		game.play();
	}

}
