package mainpack.Items;

public class Service extends Item {

	private String libelle;
	private String photo;
	private String prix;
	private String description;
	private int idVendeur;
	private String promo;
	private boolean offreGroupe;
	private String categorie;

	public Service(int id, String libelle, String photo, String prix,
			String description, int idVendeur, String promo,
			boolean offreGroupe, String categorie) {
		super(id);
		this.setLibelle(libelle);
		this.setPrix(prix);
		this.setDescription(description);
		this.setPhoto(photo);
		this.setIdVendeur(idVendeur);
		this.setPromo(promo);
		this.setOffreGroupe(offreGroupe);
		this.setCategorie(categorie);

	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription(){
		return description;
	}
	

	public void setPrix(String prix) {
		this.prix = prix;

	}
	
	public String getPrix(){
		return prix;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String renderHTML() {
		String res = "<td>Id : " + idt + "<br> Libellé : " + libelle
				+ "<br> Prix : " + prix + "<br> Description : " + description;

		return res;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public int getIdVendeur() {
		return idVendeur;
	}

	public void setIdVendeur(int idVendeur) {
		this.idVendeur = idVendeur;
	}

	public String getPromo() {
		return promo;
	}

	public void setPromo(String promo) {
		this.promo = promo;
	}

	public boolean isOffreGroupe() {
		return offreGroupe;
	}

	public void setOffreGroupe(boolean offreGroupe) {
		this.offreGroupe = offreGroupe;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

}
