package mainpack;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class BDDTest {
	BDD bdd;

	@Before
	public void before(){
		bdd=new BDD();
		Init.getInstance().exempleClient();
	}
	
	@Test
	public void test() {
		System.out.println(bdd.getRandomClient());
	}

}
