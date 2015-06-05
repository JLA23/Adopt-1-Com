package mainpack;

public class BDD {

	private Client[] tab;
	
	public BDD() {
		tab = new Client[4];
		tab[0] = new Client(1, "Pierre", "Dupont", "Celio");
		tab[1] = new Client(2, "Jean", "Petit", "Kiabi");
		tab[2] = new Client(3, "Sylvie", "Defives", "Nocibé");
		tab[3] = new Client(4, "Roger", "Gros", "Boucherie Gros");
	}
	
	public Client[] getClient() {
		return this.tab;
	}
}
