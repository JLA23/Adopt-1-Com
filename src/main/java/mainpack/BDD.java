package mainpack;

import java.util.Random;

import com.adopt.bdd.ClientDao;
import com.adopt.bdd.ProduitDao;
import com.adopt.bdd.ServiceDao;

import mainpack.Items.*;

public class BDD {

	Init init;

	public BDD() {
		init = Init.getInstance();
	}

	public Item getRandomItem() {
		int r = (int) new Random().nextInt(3);
		if (r == 0) {
			return getRandomClient();
		} else if (r == 1) {
			return getRandomProduit();
		} else if (r == 2) {
			return getRandomService();
		}
		return null;
	}

	private Item getRandomService() {
		ServiceDao sd = init.getServiceDao();
		return sd.findByIdt((int)new Random().nextInt(sd.count())+1);
	}

	private Item getRandomProduit() {
		ProduitDao pd = init.getProduitDao();
		return pd.findByIdt((int)new Random().nextInt(pd.count())+1);
	}

	private Item getRandomClient() {
		ClientDao cd = init.getClientDao();
		return cd.findByIdt((int)new Random().nextInt(cd.count())+1);		
	}

}
