package mainpack;

import org.junit.Before;
import org.junit.Test;

public class BDDTest {
	BDD bdd;

	@Before
	public void before(){
		bdd=new BDD();
		Init.getInstance().exempleClient();
		Init.getInstance().exempleProduit();
		Init.getInstance().exemplePromo();
		Init.getInstance().exempleService();
	}
	
	@Test
	public void test() {
		System.out.println(bdd.getRandomItem());
	}

}
