package ihm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IhmTest {

	@Test
	public void testaskNamePlayer() {
		int  numJ = 12;
		Iihm  Ihm = new Ihm();
		assertEquals("prenom",Ihm.askNamePlayer(numJ));
	}

	@Test
	public void askColorPlayer(){
		int numJ = 2;
		Iihm  Ihm = new Ihm();
		assertEquals("b",Ihm.askColorPlayer(numJ));
	}
	
	@Test
	public void askXpos (){
		String namePlayer = "nom";
		Iihm  Ihm = new Ihm();
		assertEquals(3, Ihm.askXpos(namePlayer)); // TRUE
		//assertEquals(-1, Ihm.askXpos(namePlayer)); // FALSE
	}
	
	@Test
	public void askYpos(){
		String namePlayer = "nom";
		Iihm  Ihm = new Ihm();
		assertEquals(2, Ihm.askYpos(namePlayer)); // TRUE 
		//assertEquals("a", Ihm.askYpos(namePlayer)); // FALSE 
	}
	
} 
