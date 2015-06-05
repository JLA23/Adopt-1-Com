package mainpack.Items;

public class Produit extends Item {

	private String nom;
	private String prenom;
	private String entite;
	private String libelle;
	private String prix;
	private String description;

	public Produit(String id, String libelle, String prix, String description) {
		super(id);
		this.libelle = libelle;
		this.prix = prix;
		this.description = description;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
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

	public String toString() {
		return id + "; " + nom + "; " + prenom + "; " + entite + ".";
	}

	public String renderHTML() {
		String res = "<td>Id : " + id + "<br> Libellé : " + libelle
				+ "<br> Prix : " + prix + "<br> Description : " + description;

		return res;
	}

}
