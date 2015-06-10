package mainpack;

import static org.junit.Assert.*;

import org.junit.Test;

import com.adopt.bdd.Ville;

public class VilleTest {
	
	int cp = 59147;
	String ville = "GONDECOURT";

	@Test
	public void testVille() {
		assertNotNull(new Ville(cp, ville));
	}
	
	@Test
	public void testGetCp(){
		Ville town = new Ville(cp, ville);
		assertEquals(59147, town.getCp());
	}
	
	@Test
	public void testSetCp(){
		Ville town = new Ville(cp, ville);
		town.setCp(59200);
		assertEquals(59200, town.getCp());
	}
	
	@Test
	public void testGetVille(){
		Ville town = new Ville(cp, ville);
		assertEquals("GONDECOURT", town.getVille());
	}
	
	@Test
	public void testSetVille(){
		Ville town = new Ville(cp, ville);
		town.setVille("HERRIN");
		assertEquals("HERRIN", town.getVille());
	}
	
	@Test
	public void testToString(){
		Ville town = new Ville(cp, ville);
		assertEquals("59147: GONDECOURT", town.toString());
	}
	
	
	
	
	
	

}
