package mainpack;

import java.util.Random;

import mainpack.Items.*;

public class BDD {

	private Client[] tabCli;
	private Produit[] tabPro;
	private Service[] tabServ;
	private Offre[] tabOff;

	public BDD() {
		tabCli = new Client[2];
		tabPro = new Produit[2];
		tabServ = new Service[2];
		tabOff = new Offre[2];
		
		
		tabCli[0] = new Client("C1", "Pierre", "Dupont", "Celio");
		tabCli[1] = new Client("C2", "Jean", "Petit", "Kiabi");
		tabPro[0] = new Produit("P1", "Chaise", "15€", "Chaise en paille");
		tabPro[1] = new Produit("P2", "Lunettes de soleil", "60€", "Lunettes de soleil noires");
		tabServ[0] = new Service("S1", "Massage", "20€", "Massage d'une durée d'une heure");
		tabServ[1] = new Service("S2", "Réparation ordi", "variable", "Réparations de tous types avec devis");
		tabOff[0] = new Offre("O1", "Promo jeans", "50€", "60€", "10€", "Promotion exceptionnelle sur les jeans", "12/05/2015");
		tabOff[1] = new Offre("O2", "Promo 10 chaises", "120€", "150€", "30€","Profitez de notre promo si vous achetez dix chaises","19/05/2015");
		/*tabCli[2] = new Client("C3", "Sylvie", "Defives", "Nocibé");
		tabCli[3] = new Client("C4", "Roger", "Gros", "Boucherie Gros");
		tabCli[4] = new Client("C5", "Michel", "Kamini", "Kamini France");
		tabCli[5] = new Client("C6", "Jean-Pierre", "Jambon",
				"Rempailleur de Chaises Jambon");
		tabCli[6] = new Client("C7", "Catherine", "Carlos", "Universal Musique");
		tabCli[7] = new Client("C8", "Fabian", "Rito", "Bourbie & Co");*/
		
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
