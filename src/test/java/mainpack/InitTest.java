package mainpack;

import static org.junit.Assert.*;
import mainpack.Items.Client;

import org.junit.Before;
import org.junit.Test;

public class InitTest {
	Init init;
	@Before
	public void before(){
		init = Init.getInstance();
		
	}
	@Test
	public void testClient() {
		Client cl = init.getClientDao().findByIdt(1);
		assertEquals("Bourbie", cl.getPrenom());
		System.out.println(cl.getId());
	}

}
