package mainpack;

import static org.junit.Assert.*;
import mainpack.Items.Client;

import org.junit.Before;
import org.junit.Test;

public class InitTest {
	Init init;
	@Before
	public void before(){
		init = new Init();
		init.initDao();
		init.initTables();
		
	}
	@Test
	public void test() {
		init.getClientDao().insert(new Client(-1, null, "Bourbie", "Rito", "Bourbie & co", "59000", "Lille", "bourbie@gmail.com", "bourbie", "0606060606", "01/01/0001", "0404040404", "Bourbiste", "Bourbe", "Blblblblblblblblbblblblblbl", "http://facebourbe/bourbie", "http://twitter/bourbie", null, null, null, "service", "talent", true));
		Client cl = init.getClientDao().findByIdt(1);
		assertEquals("Bourbie", cl.getPrenom());	
	}

}
