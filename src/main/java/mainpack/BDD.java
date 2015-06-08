package mainpack;

import java.util.Random;

import mainpack.Items.*;

public class BDD {

	private Client[] tabCli;
	private Produit[] tabPro;
	private Service[] tabServ;
	private Promo[] tabOff;

	public BDD() {
		tabCli = new Client[2];
		tabPro = new Produit[2];
		tabServ = new Service[2];
		tabOff = new Promo[2];
		
		
	
	}

	public Client[] getClients() {
		return this.tabCli;
	}

	public Item getRandomItem() {
		int r=(int) new Random().nextInt(4);
		if(r==0){
			return getRandomClient();
		}
		else if(r==1){
			return getRandomProduit();
		}
		else if(r==2){
			return getRandomService();
		}
		else if(r==3){
			return getRandomOffre();
		}
		return null;
	}

	private Item getRandomOffre() {
		return tabOff[(int) new Random().nextInt(tabOff.length)];

	}

	private Item getRandomService() {
		return tabServ[(int) new Random().nextInt(tabServ.length)];
	}

	private Item getRandomProduit() {
		return tabPro[(int) new Random().nextInt(tabPro.length)];
	}

	private Item getRandomClient() {
		return tabCli[(int) new Random().nextInt(tabCli.length)];
	}


}
