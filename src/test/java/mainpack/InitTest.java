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
		Client cl = init.getClientDao().findByIdt(1);
		assertEquals("Bourbie", cl.getPrenom());	
	}

}
