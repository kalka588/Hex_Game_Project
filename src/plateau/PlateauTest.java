package plateau;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pieces.Piece;

public class PlateauTest {

	@Test
	public void getPlateau() {
		int taille = 6;
		Plateau plateau = new Plateau(taille);
		assertEquals( taille, plateau.getPlateau().length);	
	}
	
	@Test
	public void xyValidation(){
	    int taille = 4;
	    Plateau plateau = new Plateau(taille);
	    assertEquals(true, plateau.xyValidation(2,3));
	}
	
	@Test
	public void caseVide(){
		
		int taille = 1;
		Plateau casevide = new Plateau(taille);
		assertEquals(true, casevide.caseVide(0,0));
		
	Piece P = new Piece("x", 0,0);
	casevide.place(0, 0, P);
	assertEquals(false, casevide.caseVide(0, 0));
	
	
	}
}
