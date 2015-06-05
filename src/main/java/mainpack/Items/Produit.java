package mainpack.Items;

public class Produit extends Item {

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
		this.libelle = libelle;
	}

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String toString() {
		return id + "; " + libelle + "; " + prix + "; " + description + ".";
	}

	public String renderHTML() {
		String res = "<td>Id : " + id + "<br> Libellé : " + libelle
				+ "<br> Prix : " + prix + "<br> Description : " + description;

		return res;
	}

}
