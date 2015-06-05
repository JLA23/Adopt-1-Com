package mainpack;

import mainpack.Items.*;

public class BDD {

	private Client[] tab;
	
	public BDD() {
		tab = new Client[8];
		tab[0] = new Client("C1", "Pierre", "Dupont", "Celio");
		tab[1] = new Client("C2", "Jean", "Petit", "Kiabi");
		tab[2] = new Client("C3", "Sylvie", "Defives", "Nocibé");
		tab[3] = new Client("C4", "Roger", "Gros", "Boucherie Gros");
		tab[4] = new Client("C5", "Michel", "Kamini", "Kamini France");
		tab[5] = new Client("C6", "Jean-Pierre", "Jambon", "Rempailleur de Chaises Jambon");
		tab[6] = new Client("C7", "Catherine", "Carlos", "Universal Musique");
		tab[7] = new Client("C8", "Fabian", "Rito", "Bourbie & Co");
	}
	
	public Client[] getClients() {
		return this.tab;
	}

	public static Item getRandomItem() {
		// TODO Auto-generated method stub
		return null;
	}
}
