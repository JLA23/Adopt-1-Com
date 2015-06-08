package mainpack;

import java.util.Random;

import com.adopt.bdd.ClientDao;
import com.adopt.bdd.ProduitDao;

import mainpack.Items.*;

public class BDD {

	Init init;

	public BDD() {
		init = Init.getInstance();
	}

	public Item getRandomItem() {
		int r = (int) new Random().nextInt(4);
		if (r == 0) {
			return getRandomClient();
		} else if (r == 1) {
			return getRandomProduit();
		} else if (r == 2) {
			return getRandomService();
		} else if (r == 3) {
			return getRandomPromo();
		}
		return null;
	}

	private Item getRandomPromo() {
		return null;
	}

	private Item getRandomService() {
		return null;
	}

	private Item getRandomProduit() {
		ProduitDao pd = init.getProduitDao();
		return pd.findByIdt((int)new Random().nextInt(pd.count())+1);
	}

	public Item getRandomClient() {
		ClientDao cd = init.getClientDao();
		return cd.findByIdt((int)new Random().nextInt(cd.count())+1);		
	}

}
