package mainpack.Items;

/**
 * 
 * @author jourdail La classe Client permet de créer des clients ainsi que leur
 *         attributs. Les getters permettent de récupérer ces derniers.
 */

public class Client extends Item {

	private String id;
	private String nom, prenom, entite;

	/**
	 * Constructeur
	 * 
	 * @param id
	 *            du client
	 * @param nom
	 *            du client
	 * @param prenom
	 *            du client
	 * @param entite
	 *            de l'entreprise ou du commerçant
	 */

	public Client(String id, String prenom, String nom, String entite) {
		super(id);
		this.nom = nom;
		this.prenom = prenom;
		this.entite = entite;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEntite() {
		return entite;
	}

	public void setEntite(String entite) {
		this.entite = entite;
	}

	public boolean equals(Object u) {
		return nom.equals(((Client) u).nom);
	}

	public String toString() {
		return id + "; " + nom + "; " + prenom + "; " + entite + ".";
	}

	public String renderHTML() {
		String res = "<td>Id : " + id + "<br> Nom : " + nom
				+ "<br> Prénom : " + prenom + "<br> Entite : " + entite;
		return res;
	}

}