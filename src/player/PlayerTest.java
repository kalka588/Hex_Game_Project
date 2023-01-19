package player;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pieces.Piece;

public class PlayerTest {

	@Test
	public void getName() {
		
		 Player play= new Player("n","c", 2);
		 assertEquals("n", play.getName());
		 
		 assertEquals("c", play.getColor());
	}
	@Test
	public void place(){
		
		Player pl  = new Player("n","b", 2);
		Piece Ple = pl.place(1,2);
		assertEquals("b", Ple.getColor());
		assertEquals(1, Ple.getX());
		assertEquals(2,Ple.getY());
		
	}	
	
	
}
