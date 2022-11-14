package tests.player;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import player.Player;

class TestPlayer {

	@Test
	void test() {
		Player player = new Player("joueur1", "bleu", 16);
		assertEquals("joueur1", player.getName()); // True
		//assertEquals("j1", player.getName()); // False
		assertEquals("bleu", player.getColor()); // True
		//assertEquals("rouge", player.getColor()); // False
	}

}
