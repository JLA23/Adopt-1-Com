package mainpack;

public class BDD {

	private Client[] tab;
	
	public BDD() {
		tab = new Client[8];
		tab[0] = new Client(1, "Pierre", "Dupont", "Celio");
		tab[1] = new Client(2, "Jean", "Petit", "Kiabi");
		tab[2] = new Client(3, "Sylvie", "Defives", "Nocibé");
		tab[3] = new Client(4, "Roger", "Gros", "Boucherie Gros");
		tab[4] = new Client(5, "Michel", "Kamini", "Kamini France");
		tab[5] = new Client(6, "Jean-Pierre", "Jambon", "Rempailleur de Chaises Jambon");
		tab[6] = new Client(7, "Catherine", "Carlos", "Universal Musique");
		tab[7] = new Client(8, "Fabian", "Rito", "Bourbie & Co");
	}
	
	public Client[] getClients() {
		return this.tab;
	}
}
